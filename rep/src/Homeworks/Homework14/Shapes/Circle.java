package Homeworks.Homework14.Shapes;

public class Circle implements Shape{
    private double radius;
    private final static double PI=3.14;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius*radius*PI;
    }
}
