package Homeworks.Homework12;

public class Circle extends GraphicEditor {
    private int radius;

    public Circle(int x, int y, int radius, String color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public void move(int newX, int newY) {
    }

    @Override
    public void resize(int width, int height) {
    }
    @Override
    public void draw() {
        System.out.println("Draw circle on coordinates (" + x + ", " + y + ")  in  " + color);
    }
}
