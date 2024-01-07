public class Example2 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 2;
        int sum1 = 1;
        int natija;
        for (int i = 0; i < n; i++) {
            natija = sum1 * sum;
            sum1 = natija;
            System.out.println(sum1);
        }
    }
}
