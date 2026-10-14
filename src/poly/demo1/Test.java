package poly.demo1;

public class Test {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("zs");
        s.setAge(23);

        Teacher t=new Teacher();
        t.setName("br");
        t.setAge(13);

        register(s);
        register(t);
    }

    public static void register(Person p){
        p.show();
    }
}
