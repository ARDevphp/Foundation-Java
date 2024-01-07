public class For22 {
    public static void main(String[] args) {
        System.out.println(for22(24,5));
    }
    public static double for22(int n, double x) {
        double sum = 1;
        int fact = 1;
        double son = x;
        for (int i = 1; i <= n; i++) {
            sum += son/fact;
            fact *= i;
            son *= x;
        }
        return sum;
    }
}
