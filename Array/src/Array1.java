public class Array1 {
    public static void main(String[] args) {
        array1(15);
    }
    static int array1(int n) {
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i * 2 + 1;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("[" + i + "]" + arr[i]);
        }
        return n;
    }
}
