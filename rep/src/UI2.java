import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.net.URL;
class UI2 extends JFrame implements MouseListener {
    private Random random = new Random();
    private ArrayList<CostomButton> buttons = new ArrayList<>();
    private int score = 0;
    private String eventName;
    private String previousEventName;
    private JLabel scoreLabel;
    private JLabel eventLabel;

    UI2() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);

        setLayout(null);
        setVisible(true);
        addMouseListener(this);

        scoreLabel = new JLabel("Score: " + score);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 40));
        scoreLabel.setForeground(Color.RED);
        scoreLabel.setBounds(20, 20, 250, 50);
        add(scoreLabel);

        eventLabel = new JLabel("Event: " + eventName);
        eventLabel.setFont(new Font("Arial", Font.BOLD, 30));
        eventLabel.setForeground(Color.RED);
        eventLabel.setBounds(500, 20, 1000, 100);
        add(eventLabel);
    }

    private void moveButton(CostomButton button) {
        int x = button.getX();
        int y = button.getY();
        int width = button.getWidth();
        int height = button.getHeight();

        int stepx = button.getStepX();
        int stepy = button.getStepY();

        while (true) {
            if (x < 0 || x + width > getWidth())
                stepx *= -1;
            if (y < 0 || y + height > getHeight())
                stepy *= -1;
            x += stepx;
            y += stepy;

            button.setBounds(x, y, width, height);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        CostomButton newButton = new CostomButton(random.nextInt(10)-5,random.nextInt(10)-5);
        newButton.setBounds(e.getX(), e.getY(), 50, 50);
        add(newButton);
        buttons.add(newButton);

        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttons.remove(newButton);
                remove(newButton);
                score += 10;
                if(buttons.size()%5==0){
                    score+=20;
                    previousEventName=eventName;
                    eventName="Double Point";
                    eventLabel.setText(" Previous: " +previousEventName + " New: " +eventName);
                    playSoundFromURL("C:\\Users\\Кирило\\Downloads\\Swiss Bell Sound (mp3cut.net).wav");
                }
                if(buttons.size()%7 == 0){
                    score-=50;
                    previousEventName=eventName;

                    eventName="Not your day -50";
                    eventLabel.setText(eventName);
                    eventLabel.setText(" Previous: " +previousEventName + " New: " +eventName);
                    playSoundFromURL("C:\\Users\\Кирило\\Downloads\\Swiss Bell Sound (mp3cut.net).wav");
                }
                if (newButton.getColor().getAlpha()<70){
                    score+=30;
                    previousEventName=eventName;

                    eventName="LUCKY +30";
                    eventLabel.setText(" Previous: " +previousEventName + " New: " +eventName);
                    playSoundFromURL("C:\\Users\\Кирило\\Downloads\\Swiss Bell Sound (mp3cut.net).wav");
                }
                if(newButton.getColor().getBlue()<100){
                    score+=40;
                    previousEventName=eventName;

                    eventName="SUPER LUCK +40";
                    eventLabel.setText(" Previous: " +previousEventName + " New: " +eventName);
                    playSoundFromURL("C:\\Users\\Кирило\\Downloads\\Swiss Bell Sound (mp3cut.net).wav");
                }
                scoreLabel.setText("Score: " + score);

                repaint();
            }
        });

        Thread thread = new Thread(() -> moveButton(newButton));
        thread.start();
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    private void playSoundFromURL(String soundPath) {
        new Thread(() -> {
            try {
                File file = new File(soundPath);
                URL url = file.toURI().toURL();
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(url);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                e.printStackTrace();
            }
        }).start();
    }


    public static void main(String[] args) {
        new UI2();
    }
}


