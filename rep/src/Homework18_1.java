import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Homework18_1 extends JFrame implements ActionListener {
    private JLabel timerLabel;
    private JLabel previousTime;
    private int seconds = 0;
    private Task task;

    public Homework18_1() {
        setTitle("Seconds meter");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        timerLabel = new JLabel("00:00:00");
        timerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timerLabel.setFont(new Font("Arial", Font.PLAIN, 40));
        add(timerLabel, BorderLayout.CENTER);

        previousTime = new JLabel("00:00:00");
        previousTime.setHorizontalAlignment(SwingConstants.CENTER);
        previousTime.setFont(new Font("Arial", Font.PLAIN, 20));
        add(previousTime, BorderLayout.CENTER);

        JButton startButton = new JButton("Start");
        startButton.addActionListener(this);
        add(startButton, BorderLayout.NORTH);

        JButton stopButton = new JButton("Stop");
        stopButton.addActionListener(this);
        add(stopButton, BorderLayout.SOUTH);

        JButton loopButton = new JButton("Loop");
        loopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                previousTime.setText(timerLabel.getText());
            }
        });
        add(loopButton, BorderLayout.SOUTH);

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        task = new Task();
    }

    public static void main(String[] args) {
        Homework18_1 app = new Homework18_1();
        app.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if ("Start".equals(command)) {
            if (!task.isAlive()) {
                task = new Task();
                task.start();
            }
        }
        else if ("Stop".equals(command)) {
            task.interrupt();
            timerLabel.setText(String.format("%02d:%02d:%02d", 0, 0, 0));
            previousTime.setText(String.format("%02d:%02d:%02d", 0, 0, 0));

            seconds = 0;
        }
    }

    class Task extends Thread {
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    seconds++;
                    int hours = seconds / 3600;
                    int minutes = hours / 60;
                    int secs = seconds % 60;
                    timerLabel.setText(String.format("%02d:%02d:%02d", hours, minutes, secs));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
