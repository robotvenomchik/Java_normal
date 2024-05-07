package Homework26;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

class View extends JFrame {
    private ViewButton button;
    private JButton settingsButton;
    private JPanel panel;

    public View(Controller controller) throws IOException {
        setTitle("Move WASD");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new ViewButton();
        controller.setView(this);
        controller.setButton(button);
        button.addKeyListener(controller);

        panel = new JPanel();
        panel.setLayout(null);

        add(panel);

        button.setBounds(0, 0, 451, 583);
        panel.add(button);

        settingsButton = new JButton("Settings");
        settingsButton.setBounds(500, 500, 200, 200);
        panel.add(settingsButton);

        settingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SettingsWindow settingsWindow = new SettingsWindow();
                settingsWindow.setView(View.this);
                settingsWindow.setLocationRelativeTo(null);
                settingsWindow.setVisible(true);
            }
        });

        Timer timer = new Timer(100, e -> {
            button.updateAnimation();
        });
        timer.start();

        setVisible(true);
    }

    public JPanel getPanel() {
        return panel;
    }
}
