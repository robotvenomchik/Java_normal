package Classwork16;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class UI extends JFrame implements ActionListener, MouseMotionListener {

    private int oldX;
    private int oldY;
    private JPanel controlPanel = new JPanel();
    private JSlider sizeSlider = new JSlider(JSlider.HORIZONTAL, 1, 20, 5);
    private JButton colorButton = new JButton("Choose Color");
    private JButton eraserButton = new JButton("eraser");

    private int count;
    private int brushSize = 5;
    int numberOfInstrument = 1;
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
                color= Color.WHITE;
            }
        });
        controlPanel.setBounds(200, 50, 250, 100);
        controlPanel.setLayout(new GridLayout(2, 2));
        controlPanel.setBorder(BorderFactory.createTitledBorder("Control Panel"));

        JLabel sizeLabel = new JLabel("Brush Size");

        controlPanel.add(sizeLabel);
        controlPanel.add(sizeSlider);

        add(controlPanel);


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

        setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (numberOfInstrument == 1) {
            Graphics2D g = (Graphics2D) getGraphics();
            g.setColor(color);
            g.setStroke(new BasicStroke(brushSize));
            if (oldX != 0 && oldY != 0) {
                g.drawLine(oldX, oldY, e.getX(), e.getY());
            }
            oldX = e.getX();
            oldY = e.getY();
        }
        if (numberOfInstrument == 2) {
            Graphics g = getGraphics();
            g.setColor(Color.WHITE);

            g.setColor(color);
            g.fillRect(e.getX(), e.getY(), brushSize, brushSize);

            oldX = e.getX();
            oldY = e.getY();
        }

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


}
