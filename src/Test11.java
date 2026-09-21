import java.util.Random;
import java.util.Scanner;


public class Test11 {
    public static void main(String[] args) {

    int[] arr=createNumber();
    int[] userInput=userInput();

    int redCount=0;
    int blueCount=0;

    for(int i=0;i<6;i++)
    {
         int redNumber=userInput[i];
         for(int j=0;j<6;j++)
             {
             if(redNumber==arr[j])
             {
                 redCount++;
                 break;
             }
             }
    }
    int blueNumber=userInput[6];
    if(arr[arr.length-1]==blueNumber)
        blueCount++;
//    System.out.println(blueNumber+" "+redCount);
    if(((redCount+blueCount)<=3) && blueCount>0)
    {
        System.out.println("恭喜你，中了5元!");
    }
    else if((redCount+blueCount)<=4)
    {
        System.out.println("恭喜你，中了10元!");
    }
    else if((blueCount+redCount)<=5)
    {
        System.out.println("恭喜你，中了200元!");
    }
    else if(redCount==5 && blueCount==1)
    {
        System.out.println("恭喜你，中了3000元!");
    }
    else if(redCount==6 && blueCount==0)
    {
        System.out.println("恭喜你，中了500万元!");
    }
    else if(redCount==6 && blueCount==1)
    {
        System.out.println("恭喜你，中了1000万元!");
    }
    else
    {
        System.out.println("谢谢惠顾!");
    }
    }

    public static int[] userInput()
    {
        int[] arr=new int[7];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;)
        {
            System.out.println("选择的红球的第"+(i+1)+"个数字是");
            int redNumber=sc.nextInt();

            if(redNumber>0&&redNumber<=33)
            {
                boolean flag=contains(arr,redNumber);
                if(!flag) {
                    arr[i] = redNumber;
                    i++;
                }
                else
                {
                    System.out.println("这个数字已经选过了");
                }
            }

            else
            {
                System.out.println("超出范围了噢");
            }

        }
        while(true)
        {
            System.out.println("选择的蓝球的数字是");
            int blueNumber=sc.nextInt();
            if(blueNumber>0&&blueNumber<=16)
            {
                arr[arr.length-1]=blueNumber;
                break;
            }
            else
            {
                System.out.println("超出范围了哦");
            }
        }
        return arr;
    }

    public static int[] createNumber()
    {
        Random r=new Random();
        int[] arr=new int[7];
        for(int i=0;i<6;)
        {
            int redNumber=r.nextInt(33)+1;
            boolean flag=contains(arr,redNumber);
            if(!flag)
            {
                arr[i]=redNumber;
                i++;
            }
        }
        int blueNumber=r.nextInt(16)+1;
        arr[arr.length-1]=blueNumber;
        return arr;
    }

    public static boolean contains(int[] arr,int n)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                return true;
            }
        }
        return false;
    }
}
