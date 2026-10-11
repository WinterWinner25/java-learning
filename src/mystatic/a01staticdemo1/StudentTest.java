package mystatic.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setGender("m");
        s1.teacherName="a";

        s1.study();
        s1.show();

        Student s2=new Student();
        s2.setName("里斯");
        s2.setAge(20);
        s2.setGender("f");

        s2.study();
        s2.show();
    }
}
