package oop_extends.a08oopextendsdemo8;

public class Student extends Person{
    public Student(){
        super();//父类的无参构造
        System.out.println("子类的无参构造");
    }

    public Student(int age, String name) {
        super(age,name);
    }

}
