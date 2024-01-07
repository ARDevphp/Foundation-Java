public class Array4 {
    public static void main(String[] args) {
        arrProgress(5,5,3);
    }
    static int arrProgress(int n, int dasXadA, int d) {
        int [] arr = new int[n];
        arr[0] = dasXadA;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1]*d;
        }
        ArrayUtil.show(arr);
        return n;
    }
}
