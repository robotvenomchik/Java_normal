package Homework26;

import javax.swing.*;
import java.io.IOException;

class View extends JFrame {
    private ViewButton button;

    public View(Controller controller) throws IOException {
        setTitle("Move WASD");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new ViewButton();
        controller.setView(this);
        controller.setButton(button);
        button.addKeyListener(controller);

        setLayout(null);
        add(button);

        Timer timer = new Timer(100, e -> {
            button.updateAnimation();
        });
        timer.start();

        setVisible(true);
    }
}
