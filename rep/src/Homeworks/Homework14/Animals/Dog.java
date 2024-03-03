package Homeworks.Homework14.Animals;

public class Dog extends Pet{
    private int hungry=50;

    @Override
    public void sound() {
        System.out.println("gaf gaf");
    }

    public int getHungry() {
        return hungry;
    }

    @Override
    public void eat() {
        if(hungry<100 && hungry+10<=100){
            System.out.println("I eat meat"); hungry+=10;
        }
        else System.out.println("I do not want");
    }

    @Override
    public void playWithOwner() {
        if(hungry>0){
            System.out.println("I play with owner");
            hungry-=10;
        }
        else{
            System.out.println( "I am hungry");
        }

    }
}
