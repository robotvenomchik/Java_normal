package Homeworks.Homework14.Animals;

public class Bird implements Animal {

    @Override
    public void sound() {
        System.out.println("ku ku");
    }

    @Override
    public void eat() {
        System.out.println("I eat bread and insects");
    }
}
