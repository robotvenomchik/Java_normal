import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class MonkeyType extends JFrame implements KeyListener, ActionListener {
    String s = "Press button to start";
    JLabel text = new JLabel();
    JButton refreshButton = new JButton("Refresh Text");
    String[] texts={"pepa likes cola and strawberry pie", "who like cola?", "I am the fastest writer on the Earth!!!!!","pepa pig ate banana"};

    MonkeyType() {
        setTitle("MonkeyType");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        text.setText(s);
        text.setHorizontalAlignment(JLabel.CENTER);
        add(text, BorderLayout.CENTER);

        refreshButton.addActionListener(this);
        refreshButton.setFocusable(false);

        add(refreshButton, BorderLayout.SOUTH);

        addKeyListener(this);
        setFocusable(true);
        setAlwaysOnTop(true);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("working  " + e.getKeyChar());
        if (e.getKeyChar() == findFirstNonUppercase(s)) {
            s = replaceFirstNonUppercase(s);
            text.setText(s);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == refreshButton) {
            s = generateNewText();
            text.setText(s);
            refreshButton.requestFocusInWindow();
        }
        refreshButton.setFocusable(false);
        System.out.println(refreshButton.isFocusable());

    }

    public static String replaceFirstNonUppercase(String input) {
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                break;
            }
        }

        return new String(chars);
    }

    public static char findFirstNonUppercase(String input) {
        char[] chars = input.toCharArray();

        for (char c : chars) {
            if (Character.isLowerCase(c)) {
                return c;
            }
        }
        return '\0';
    }

    public String generateNewText() {
        Random random = new Random();
        int index = random.nextInt(texts.length);
        return texts[index];
    }

    public static void main(String[] args) {
        new MonkeyType();
    }
}
