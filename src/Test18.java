import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=input.nextInt();
        int temp=x;
        int num=0;
        while(temp>0){
            num*=10;
            num+=temp%10;
            temp/=10;
        }
        if(num==x){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
