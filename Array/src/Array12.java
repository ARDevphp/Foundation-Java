import java.util.Arrays;

public class Array12 {
    public static void main(String[] args) {
        int []n = {1,3,4,5,6,6,4,3,5,9};
        System.out.println(Arrays.toString(n));
        arrJufIndex(n);
    }
    static void arrJufIndex(int []arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i+=2) {
            System.out.print(arr[i]+ "\t");
        }

    }
}
