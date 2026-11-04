package myexception;

public class a06demo6 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        //ArrayIndexOutOfBoundsException

        try{
            System.out.println(arr[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }
    }
}
