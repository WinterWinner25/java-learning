package oop_interface.a06demo6;

public interface Inter {
    public abstract void method();


    //默认方法不是抽象方法，所以不强制重写，但是如果被重写，重写的时候要把default去掉
    public default void show(){
        System.out.println("接口中的默认方法");
    }

}
