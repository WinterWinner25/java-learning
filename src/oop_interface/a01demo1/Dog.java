package oop_interface.a01demo1;

public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(int age, String name) {
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public void swim() {
        System.out.println("Dog swim");
    }
}
