public class Array21 {
    public static void main(String[] args) {
        int[] n = {3, 5, 6, 7, 4, 3, 4};
        arrayArif(n, 3, 5, 3);
    }

    public static void arrayArif(int[] array, int k, int l, int d) {
        array[k] = k;
        for (int i = k; i <= l; i++) {
            array[i] = array[i - 1] + d;
            System.out.println(array[i]);
        }
    }
}
