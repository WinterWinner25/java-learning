package oop_extends.a06oopentendsdemo6;

public class Test {
    public static void main(String[] args) {
        Student s=new Student();
        s.lunch();
        OverseasStudent o=new OverseasStudent();
        o.lunch();
    }
}

class Person{
    public void eat(){
        System.out.println("eat");
    }

    public void drink(){
        System.out.println("drink");
    }
}

class OverseasStudent extends Person{
    public void lunch(){
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }
    @Override
    public void eat()
    {
        System.out.println("eat spagetti");
    }
    @Override
    public void drink()
    {
        System.out.println("drink hot water");
    }

}

class Student extends Person{
    public void lunch(){
        this.eat();
        super.eat();
        drink();
    }
}