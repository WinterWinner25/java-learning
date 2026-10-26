package oop_interface.a01demo1;

public class Frog extends Animal implements Swim {

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Frog swim");
    }

    @Override
    public void eat() {
        System.out.println("Frog eat");
    }
}
