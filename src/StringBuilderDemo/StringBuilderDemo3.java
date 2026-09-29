package StringBuilderDemo;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append(true);
        sb.append("aaa");

        sb.reverse();
        int len=sb.length();
        System.out.println(len);
        System.out.println(sb);
        String str=sb.toString();
        System.out.println(str);
    }

}
