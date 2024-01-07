public class For21 {
    public static void main(String[] args) {
        int a = fact(5);
        System.out.println(a);
    }
    public static int fact(int n) {
        int sum = 1;
        int yigindi = 0;
        for (int i = 1; i <= n; i++) {
            sum *= i;
            yigindi += 1/(sum);
        }
        return yigindi;
    }
}
