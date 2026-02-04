package src.basics.polymorphism.Overriding;

public class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog Barks");
    }
}
