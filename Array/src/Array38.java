public class Array38 {
    public static void main(String[] args) {
        int[] n = {5, 2, 1, 6, 4, 3, 2, 3, 4, 5, 6, 5, 4, 3, 4};
        arrayMonoKama(n);
    }

    public static void arrayMonoKama(int[] array) {
        int count = 0;

        for (int i = 1; i < array.length; i++) {
            if (i != array.length - 1) {
                if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
                    count++;
                }
            } else {
                if (array[i] < array[i - 1]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
