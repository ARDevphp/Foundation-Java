import java.util.Arrays;

public class Array16 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 1, 2, 8, 9, 45, 76, 32, 34};
        System.out.println(Arrays.toString(arr));
        array16(arr);
    }

    public static void array16(int[] n) {
        int leftIndex = 0;
        int rightIndex = n.length - 1;

        while (true) {
            if (leftIndex <= rightIndex) {
                System.out.print(n[leftIndex] + "\t");
                leftIndex++;
            } else {
                break;
            }
            if (leftIndex <= rightIndex) {
                System.out.print(n[rightIndex] + "\t");
                rightIndex--;
            } else {
                break;
            }
        }
    }
}
