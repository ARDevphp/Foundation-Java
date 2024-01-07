public class For10 {
    public static void main(String[] args) {

    }
    public static void solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1/i;
            System.out.println(sum);
        }
    }
}
