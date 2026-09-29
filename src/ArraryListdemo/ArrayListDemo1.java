package ArraryListdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //打印对象不是地址值，而是集合中存储的数据内容
        //ArrayList是java已经写好的一个类
//      ArrayList<String> list=new ArrayList<String>();

        //1.创建集合
        ArrayList<String> list=new ArrayList<>();

        boolean result=list.add("a");

        //2.添加元素
        list.add("b");
        list.add("c");
        list.add("d");


        //3.删除元素
        boolean result2=list.remove("a");
        boolean result3=list.remove("f");
        System.out.println(result2);
        System.out.println(result3);

        System.out.println(list);

        String str=list.remove(1);

        //4.修改元素
        String result5=list.set(1,"ddd");
        System.out.println(result5);


        //5.查询元素
        String s=list.get(0);
        System.out.println(s);

        //6.遍历
        for(int i=0;i<list.size();i++)
        {
            String str1=list.get(i);
            System.out.print(str1+" ");
        }
        System.out.println();


        System.out.println(list);


    }
}
