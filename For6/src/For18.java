public class For18 {
    public static void main(String[] args) {
        solution(2,4);
    }
    public static void solution(double a, int n) {
        double sum = 0;
        double daraja = 1;
        for (int i = 1; i <= n; i++) {
            sum += daraja * a;
            daraja *= i-1;
        }
        System.out.println(sum);
    }
}
