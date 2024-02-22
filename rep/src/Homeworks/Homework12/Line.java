package Homeworks.Homework12;

public class Line extends GraphicEditor {
    private int length;

    public Line(int x, int y, int length, String color) {
        super(x, y, color);
        this.length = length;
    }

    @Override
    public void move(int newX, int newY) {
    }

    @Override
    public void resize(int width, int height) {
    }
    @Override
    public void draw() {
        System.out.println("Draw Line on coordinates (" + x + ", " + y + ")  in  " + color);
    }
}
