import java.sql.Array;
import java.util.Arrays;

public class Array7 {
    public static void main(String[] args) {
        int []n = {4,5,6,7,8,98,3,2,3};
        System.out.println(Arrays.toString(n));
        arrTes(n);
     }
    static void arrTes(int[] arr){
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
    }
}
