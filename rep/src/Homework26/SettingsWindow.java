package Homework26;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SettingsWindow extends JFrame {
    private JPanel panel;
    private JButton colorButton;
    private View view;
    private JSlider widthSlider;
    private JSlider heightSlider;

    public SettingsWindow() {
        setTitle("Settings");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel = new JPanel();
        colorButton = new JButton("Change Background Color");

        // Width Slider
        widthSlider = new JSlider(JSlider.HORIZONTAL, 100, 10000, 1000);
        widthSlider.setMajorTickSpacing(100);
        widthSlider.setMinorTickSpacing(50);
        widthSlider.setPaintTicks(true);
        widthSlider.setPaintLabels(true);
        widthSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int width = widthSlider.getValue();
                view.setSize(width, view.getHeight());
            }
        });

        // Height Slider
        heightSlider = new JSlider(JSlider.HORIZONTAL, 100, 10000, 1000);
        heightSlider.setMajorTickSpacing(100);
        heightSlider.setMinorTickSpacing(50);
        heightSlider.setPaintTicks(true);
        heightSlider.setPaintLabels(true);
        heightSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int height = heightSlider.getValue();
                view.setSize(view.getWidth(), height);
            }
        });

        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(SettingsWindow.this, "Choose Background Color", getBackground());
                if (color != null) {
                    view.getPanel().setBackground(color);
                }
            }
        });

        panel.add(colorButton);
        panel.add(new JLabel("Width:"));
        panel.add(widthSlider);
        panel.add(new JLabel("Height:"));
        panel.add(heightSlider);
        add(panel);
    }

    public void setView(View view) {
        this.view = view;
    }
}