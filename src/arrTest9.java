import java.util.Random;
import java.util.Scanner;

public class arrTest9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r=new Random();
        int[] arr={1,2,3,4,5};
        for(int i=0;i<arr.length;i++)
        {
            int randomIndex=r.nextInt(arr.length);
            int temp=arr[randomIndex];
            arr[randomIndex]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]+" ");
        }
    }
}
