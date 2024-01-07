public class Array30 {
    public static void main(String[] args) {
        int[] n = {2, 3, 4, 5, 6, 7, 8, 3, 1, 2, 4};
        array30(n);
    }

    static void array30(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.print(array[i] + " " +
                        "");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
