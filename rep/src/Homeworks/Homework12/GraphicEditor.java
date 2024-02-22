package Homeworks.Homework12;

abstract class GraphicEditor {

    protected int x;
    protected int y;
    protected String color;
    public GraphicEditor(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void draw();
    public abstract void move(int newX, int newY);
    public abstract void resize(int width, int height);
}
