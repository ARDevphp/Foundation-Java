import java.util.Arrays;

public class Array17 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 5, 4, 5, 3, 2, 9, 5};
        System.out.println(Arrays.toString(arr));
        solution(arr);
    }

    static void solution(int[] array) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while (true) {
            if (leftIndex <= rightIndex) {
                System.out.print(array[leftIndex] + "\t");
                leftIndex++;
            } else {
                break;
            }
            if (leftIndex <= rightIndex) {
                System.out.print(array[leftIndex] + "\t");
                leftIndex++;
            } else {
                break;
            }
            if (leftIndex <= rightIndex) {
                System.out.print(array[rightIndex] + "\t");
                rightIndex--;
            } else {
                break;
            }
            if (leftIndex <= rightIndex) {
                System.out.print(array[rightIndex] + "\t");
                rightIndex--;
            } else {
                break;
            }
        }
    }
}
