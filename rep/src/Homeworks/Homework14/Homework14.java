package Homeworks.Homework14;

import Homeworks.Homework14.Animals.Bird;
import Homeworks.Homework14.Animals.Cat;
import Homeworks.Homework14.Animals.Dog;
import Homeworks.Homework14.Shapes.Circle;
import Homeworks.Homework14.Shapes.Rectangle;
import Homeworks.Homework14.Shapes.Shape;
import Homeworks.Homework14.Shapes.Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework14 {
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        Rectangle rectangle=new Rectangle(10,15);
        Triangle triangle=new Triangle(10,15);
        List<Shape> shapes=new ArrayList<>(Arrays.asList(circle, rectangle,triangle));
        for (Shape shape:
             shapes) {
            System.out.println(shape.calculateArea()+" "+ shape.getClass().getSimpleName());
        }

        System.out.println("----------------DOG--------------------");

        Dog dog = new Dog();
        System.out.println(dog.getHungry());
        dog.playWithOwner();
        System.out.println(dog.getHungry());
        dog.sound();
        dog.eat();
        System.out.println(dog.getHungry());
        System.out.println("-------------CAT------------------");
        Cat cat = new Cat();
        System.out.println(cat.getHungry());
        cat.playWithOwner();
        System.out.println(cat.getHungry());
        cat.sound();
        cat.eat();
        System.out.println(cat.getHungry());
        System.out.println("-------------Bird------------------");
        Bird bird= new Bird();
        bird.sound();
        bird.eat();
    }



}
