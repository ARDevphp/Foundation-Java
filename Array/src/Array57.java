import java.util.Arrays;

public class Array57 {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 2, 4, 5, 7, 4, 2, 9, 12, 14};
        array(array);
    }

    static void array(int[] arr) {
        int a = 0;
        int b = 0;
        int[] arrayB = new int[arr.length];
        for (int i = 0; i < arr.length; i ++) {
           arrayB[i/2] = arr[i];
        }
        System.out.println(Arrays.toString(arrayB));
        for (int i = 1; i < arr.length; i+=2) {
            arrayB[i/2] = arr[i];
        }
        System.out.println(Arrays.toString(arrayB));
    }
}
