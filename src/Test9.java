import java.util.Random;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        int[] arr={2,288,588,988,2080};
        int[] newArr=new int[arr.length];
        Random r=new Random();
        for(int i=0;i<arr.length;)
        {
            int randomIndex=r.nextInt(arr.length);
            int price=arr[randomIndex];
            boolean d=contain(newArr,price);
            if(!d)
            {
                newArr[i]=price;
                i++;
            }

        }
        for(int i=0;i<newArr.length;i++)
        {
            System.out.print(newArr[i]+" ");
        }

    }
    public static boolean contain(int[] arr,int x)
    {
        for(int i=0;i<arr.length;i++)
            {
            if(arr[i]==x)
                return true;
            }
        return false;
    }
}
