public class Array10 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 8, 6, 9};
        arrJufTog(arr);
    }

    static void arrJufTog(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + "\t");
            }
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + "\t");
            }
        }
    }
}
