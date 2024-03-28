package Homeworks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Homework18 extends JFrame implements ActionListener {
    private JLabel timerLabel;
    private Timer timer;
    private int seconds = 0;

    public Homework18() {
        setTitle("Таймер та Секундомір");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        timerLabel = new JLabel("00:00:00");
        timerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timerLabel.setFont(new Font("Arial", Font.PLAIN, 40));
        add(timerLabel, BorderLayout.CENTER);

        JButton startButton = new JButton("Старт");
        startButton.addActionListener(this);
        add(startButton, BorderLayout.NORTH);

        JButton stopButton = new JButton("Стоп");
        stopButton.addActionListener(this);
        add(stopButton, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {

        Homework18 app = new Homework18();
        app.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        Task task= new Task();
        if ("start".equals(command)) {
            task.start();
        } else if ("stop".equals(command)) {
            timer.stop();
            seconds = 0;
      } else {
            seconds++;
            task.start();
        }
    }


    class Task extends Thread{
        public void run() {

            while (true) {
                seconds++;
                int hours = seconds / 3600;
                int minutes = (seconds % 3600) / 60;
                int secs = seconds % 60;
                timerLabel.setText(String.format("%02d:%02d:%02d", hours, minutes, secs));
            }

        }
    }

}
