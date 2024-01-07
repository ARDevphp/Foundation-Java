import java.util.Arrays;

public class Array31 {
    public static void main(String[] args) {
        int[] n = {3, 4, 5, 3, 2, 3, 4, 6, 3};
        System.out.println(Arrays.toString(n));
        solution(n);
    }

    static void solution(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                System.out.print(arr[i] + "\t");
            }
        }
        System.out.println();
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                System.out.print(arr[i] + "\t");
            }
        }
    }
}
