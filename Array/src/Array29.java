public class Array29 {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 6, 7, 8, 1, 2, 5};

        System.out.println(anInt(array));
    }

    static int anInt(int[] arr) {
        int max = arr[1];

        for (int i = 1; i < arr.length; i +=2) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
