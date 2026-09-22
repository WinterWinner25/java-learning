public class Student {
    String name;
    int age;
    String major;

    public static void main(String[] args)
    {
        Student s=new Student();
        s.introduce();
    }

    Student()
    {
        this("小明",18,"人工智能");
    }

    Student(String name,int age,String major)
    {
        this.name=name;
        this.age=age;
        this.major=major;
    }

    public void introduce()
    {
        System.out.println("我的名字是"+name);
        System.out.println("我的年龄是"+age);
        System.out.println("我的专业是"+major);
        this.sayhello();
    }

    public void sayhello()
    {
        System.out.println("大家好，我是"+name);
    }
}
