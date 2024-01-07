public class Array37 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 4, 5, 9, 6, 8, 5, 1, 2, 3, 2, 3};
        arrayMonoton(arr);
    }
    public static void arrayMonoton(int[] array) {
        int count = 0;

        for (int i = 1; i < array.length; i++) {

            if (i != array.length - 1) {
                boolean isFull = array[i] > array[i - 1] && array[i] > array[i + 1];
                if (isFull) {
                    count++;
                }
            } else {
                if (array[i] > array[i - 1]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
