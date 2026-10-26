package oop_interface.a01demo1;

public class Rabbit extends Animal{

    public Rabbit() {
    }

    public Rabbit(int age, String name) {
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("Rabbit eat");
    }
}
