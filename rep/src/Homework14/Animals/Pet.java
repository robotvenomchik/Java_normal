package Homework14.Animals;

abstract public class Pet implements Animal{
    private int hungry;

    @Override
    abstract public void sound();

    @Override
    abstract public void eat();


    abstract void playWithOwner();
}
