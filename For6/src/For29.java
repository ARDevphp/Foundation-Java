public class For29 {
    public static void main(String[] args) {
        System.out.printf("%,2f",solution(10, 1.1, 7.8));
    }
    public static double solution(int n, double a, double b) {
        double sum = 0;
        for (double i = a; i <= b; i++) {
            sum = b - a;
            sum = sum / n;
        }
        return sum;
    }
}
