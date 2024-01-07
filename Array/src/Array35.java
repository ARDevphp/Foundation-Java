public class Array35 {
    public static void main(String[] args) {
        int [] n = {2,1,1,6,7,3,1,2,1,8,5};
        ArrayMin(n);
    }

    static void ArrayMin(int[] array) {
        int min = array[1];

        for (int i = 1; i < array.length; i++) {

            if (array[i - 1] < array[i] && array[i] > array[i + 1]) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
        }
        System.out.println(min);
    }
}
