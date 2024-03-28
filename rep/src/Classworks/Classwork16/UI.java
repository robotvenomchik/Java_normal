package Classworks.Classwork16;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class UI extends JFrame implements ActionListener, MouseMotionListener {

    private int oldX;
    private int oldY;
    private JPanel controlPanel = new JPanel();
    private JSlider sizeSlider = new JSlider(JSlider.HORIZONTAL, 1, 20, 5);
    private JButton colorButton = new JButton("Choose Color");
    private JButton eraserButton = new JButton("Eraser");
    private JButton saveButton = new JButton("Save");
    private JButton loadButton = new JButton("Load Image");
    private BufferedImage loadedImage;
    private BufferedImage canvas;

    private int brushSize = 5;
    private Color color = Color.BLACK;

    UI() {
        setSize(500, 700);
        setLayout(null);

        addMouseMotionListener(this);

        colorButton.setBounds(20, 50, 150, 50);
        add(colorButton);

        eraserButton.setBounds(20, 150, 150, 50);
        add(eraserButton);
        eraserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                color = Color.WHITE;
            }
        });

        controlPanel.setBounds(200, 50, 250, 100);
        controlPanel.setLayout(new GridLayout(2, 2));
        controlPanel.setBorder(BorderFactory.createTitledBorder("Control Panel"));

        JLabel sizeLabel = new JLabel("Brush Size");

        controlPanel.add(sizeLabel);
        controlPanel.add(sizeSlider);

        add(controlPanel);

        saveButton.setBounds(20, 250, 150, 50);
        add(saveButton);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveImage();
            }
        });

        loadButton.setBounds(20, 350, 150, 50);
        add(loadButton);
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadImage();
            }
        });

        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                color = JColorChooser.showDialog(UI.this, "Choose Color", color);
            }
        });
        sizeSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                brushSize = sizeSlider.getValue();
            }
        });

        canvas = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (canvas != null) {
            g.drawImage(canvas, 0, 0, this);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics2D g = canvas.createGraphics();
        g.setColor(color);
        g.setStroke(new BasicStroke(brushSize));
        if (oldX != 0 && oldY != 0) {
            g.drawLine(oldX, oldY, e.getX(), e.getY());
        }
        oldX = e.getX();
        oldY = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        oldX = 0;
        oldY = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        color = Color.MAGENTA;
    }

    private void saveImage() {
        try {
            if (canvas != null) {
                File outputFile = new File("drawing.png");
                ImageIO.write(canvas, "png", outputFile);
                JOptionPane.showMessageDialog(UI.this, "Image saved successfully");
            } else {
                JOptionPane.showMessageDialog(UI.this, "No image to save");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(UI.this, "Failed to save image");
        }
    }

    private void loadImage() {
        try {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(UI.this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                loadedImage = ImageIO.read(selectedFile);
                canvas = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2d = canvas.createGraphics();
                g2d.drawImage(loadedImage, 0, 0, null);
                g2d.dispose();
                repaint();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(UI.this, "Failed to load image");
        }
    }

    public static void main(String[] args) {
        new UI();
    }
}
