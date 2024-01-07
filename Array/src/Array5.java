public class Array5 {
    public static void main(String[] args) {
        array5(15);
    }

    static int array5(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        ArrayUtil.show(arr);
        return n;
    }
}
