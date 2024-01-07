public class Array20 {
    public static void main(String[] args) {
        int [] n = {2,5,6,7,4,2,3,5,7};
        inArray(n,2,6);
    }
    public static void inArray(int []array, int k, int l) {
        int sum = 0;
        for (int i = k; i <= l; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
