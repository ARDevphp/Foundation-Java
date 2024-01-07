public class For38 {
    public static void main(String[] args) {
        System.out.println(solution(6));
    }
    public static int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int ar = 0;
            for (int j = 0; j <= i; j++) {
                ar += i;
                System.out.println(ar);
            }
            sum += ar;
            System.out.println(sum);
        }
        return sum;
    }
}
