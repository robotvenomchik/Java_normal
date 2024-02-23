package Homeworks.Homework12;

public class Homework12 {
    public static void main(String[] args) {
        Product pepa=new Product("pepa", 100, 1);
        Order order= new Order("batman", "Kyev");
        order.addProduct(pepa);
        System.out.println(order.toString());
        order.removeProductByName("pepa");
        System.out.println(order.toString());

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
