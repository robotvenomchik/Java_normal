package Homeworks.Homework12;

public class Homework12 {
    public static void main(String[] args) {
        
        GraphicEditor rectangle = new Rectangle(10, 20, 30, 40, "Blue");
        GraphicEditor circle = new Circle(50, 60, 25, "Red");
        GraphicEditor line = new Line(70, 80, 100, "Green");

        drawShape(rectangle);
        drawShape(circle);
        drawShape(line);

    }

    public static void drawShape(GraphicEditor graphicEditor) {
        graphicEditor.draw();
    }
}
