package Homeworks.Homework12;

public class Rectangle extends GraphicEditor {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height, String color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void move(int newX, int newY) {

    }

    @Override
    public void resize(int width, int height) {

    }
    @Override
    public void draw() {
        System.out.println("Draw rectangle on coordinates (" + x + ", " + y + ")  in  " + color);
    }
}
