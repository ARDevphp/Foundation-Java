public class Array6 {
    public static void main(String[] args) {
        arrYgi(10,1,2);
    }

    static void arrYgi(int n, int a, int b) {
        int[] arr = new int[n];
        arr[0] = a;
        arr[1] = b;
        int sum = b;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = sum;
            sum += arr[i-1];
            System.out.println(sum);
        }
        //ArrayUtil.show(arr);
    }
}
