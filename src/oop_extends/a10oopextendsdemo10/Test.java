package oop_extends.a10oopextendsdemo10;

public class Test {
    public static void main(String[] args) {
        Manager m=new Manager("41451","看到",1500,300);
        System.out.println(m.getId()+", "+m.getName()+", "+m.getSalary()+", "+
                m.getBonus());

        m.work();
        m.eat();

        Cook c=new Cook();
        c.work();
    }
}
