import java.util.Arrays;
import java.util.Scanner;

public class Array28 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 3, 2, 5, 10, 4, 4, 3, 1};
                    //0    2     4     6      8     10
        System.out.println(array28(arr));
    }

    static int array28(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i += 2) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
