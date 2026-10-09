package ArraryListdemo.test;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<User> list=new ArrayList<>();

        User u1=new User("001","spring","111111");
        User u2=new User("002","summer","222222");
        User u3=new User("003","winter","333333");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        boolean flag=contains(list,"001");

        System.out.println(flag);
    }

    public static boolean contains(ArrayList<User> list,String id){
        for(int i=0;i<list.size();i++){
            User u=list.get(i);
            String uid=u.getId();
            if(uid.equals(id)){
                return true;
            }
        }
        return false;
    }

}
