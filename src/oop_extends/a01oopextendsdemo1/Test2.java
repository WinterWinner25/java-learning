package oop_extends.a01oopextendsdemo1;

public class Test2 {
    public static void main(String[] args) {
        Zi z=new Zi();
        z.show();
    }
}

class Fu{
    String name="Fu";
    String hobby="喝茶";
}

class Zi extends Fu{
    String name="Zi";
    String game="吃鸡";
    public void show(){
        System.out.println(name);
        System.out.println(super.name);
        System.out.println(super.hobby);
        System.out.println(hobby);
        System.out.println(this.hobby);
        System.out.println(this.game);
    }
}
