package myexception;

public class a09demo9 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        //ArrayIndexOutOfBoundsException

        try{
            System.out.println(arr[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("结束");
    }
}
