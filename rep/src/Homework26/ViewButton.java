package Homework26;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class ViewButton extends JButton {
    private BufferedImage spriteSheet;
    private int frameWidth = 451;
    private int frameHeight = 583;
    private int totalFrames = 16;
    private int currentFrame = 0;
    private int columns = 4;
    private int drawX = 0;
    private int drawY = 0;

    public ViewButton() {
        setBounds(0, 0, frameWidth, frameHeight);
        try {
            this.spriteSheet = ImageIO.read(new File("rep/src/Homework26/SpriteSheet.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateAnimation() {
        currentFrame = (currentFrame + 1) % totalFrames;
        int offsetX = (currentFrame % columns) * frameWidth;
        int offsetY = (currentFrame / columns) * frameHeight;
        setNewCoordinates(offsetX, offsetY);
    }

    private void setNewCoordinates(int x, int y) {
        this.drawX = x;
        this.drawY = y;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(spriteSheet, 0, 0, frameWidth, frameHeight, drawX, drawY, drawX + frameWidth, drawY + frameHeight, this);
    }
}


