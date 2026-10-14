package oop_extends.a08oopextendsdemo8;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("父类的无参构造");
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
