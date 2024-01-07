public class For30 {
    public static void main(String[] args) {
        System.out.printf("%.2f",solution(10, 1.1,7.8));
    }
    public static double solution(int n, double a, double b) {
        double sum = 0;
        double daraja = 0;
        double e = 0;
        for (int i = 1; i <= n; i++) {
            sum = b-a;
            daraja = sum / n;
            e += daraja;
            System.out.printf("%.2f \n",e);
        }
        return 1;
    }
}
