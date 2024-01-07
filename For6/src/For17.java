public class For17 {
    public static void main(String[] args) {
        solution(1.5,4);
    }
    public static void solution(double a, int n) {
        double s = 0,d = 1;
        for (int i = 0; i <= n; i++) {
            s += d;
            d *= a;
        }
        System.out.println(s);
    }
}
