public class For16 {
    public static void main(String[] args) {
        solution(2,5);
        solution(2,3);
    }
    public static void solution(double a,int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= a;
            System.out.println(sum);
        }
    }
}
