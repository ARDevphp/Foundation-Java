public class Array3 {
    public static void main(String[] args) {
        array3(7,3);
    }
    static int array3(int n,int d) {
        int []arr = new int[n];
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1]+d;
        }
        ArrayUtil.show(arr);
        return n;
    }
}