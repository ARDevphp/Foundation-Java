public class For36 {
    public static void main(String[] args) {
        System.out.println(solution(3,3));
    }

    public static int solution(int n, int k) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int result = 1;
            for (int j = 1; j <= i; j++) {
                result *= k;
               // System.out.println(result);
            }
            System.out.println(result);
            sum += result;
        }
        return sum;
    }
}
