package Homeworks.Homework14.Shapes;

public class Triangle implements Shape{
    private double sideWithHeight;
    private double height;

    public Triangle(double sideWithHeight, double height) {
        this.sideWithHeight = sideWithHeight;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return sideWithHeight*height*0.5;
    }
}
