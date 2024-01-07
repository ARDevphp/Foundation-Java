import java.util.Arrays;

public class Array33 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 5, 6, 7, 4, 3, 8, 6};
        System.out.println(Arrays.toString(arr));
        arrayLocal(arr);
    }

    static void arrayLocal(int[] array) {
        int max = 0;
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                max = i;
                if (index < max) {
                    index = i;
                }
            }
        }
        System.out.println(index);
    }
}
