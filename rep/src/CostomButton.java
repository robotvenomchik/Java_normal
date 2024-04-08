import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class CostomButton extends JButton {
    private int stepX;
    private int stepY;
    private Random random = new Random();
    private Color color=new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

    public CostomButton(int stepX, int stepY) {
        this.stepX = stepX;
        this.stepY = stepY;
        this.setBackground(color);

    }

    public int getStepX() {
        return stepX;
    }

    public Color getColor() {
        return color;
    }

    public void setStepX(int stepX) {
        this.stepX = stepX;
    }

    public int getStepY() {
        return stepY;
    }

    public void setStepY(int stepY) {
        this.stepY = stepY;
    }
}