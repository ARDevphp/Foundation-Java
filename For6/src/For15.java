public class For15 {
    public static void main(String[] args) {
        System.out.println(result(5,2));
        System.out.println(result(5,3));
        System.out.println(result(5,4));
    }
    public static int result(double a, int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= a;
        }
        return sum;
    }
}
