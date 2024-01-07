public class For34 {
    public static void main(String[] args) {
        solution(10);
    }
    public static void solution(int n) {
        int a1 = 1, a2 = 1;
        int sum;
        for (int i = 1; i <= n; i++) {
            sum = (a1 + 2 * a2) ;
            a1 = a2;
            a2 = sum;
            System.out.println(a2);
        }
    }
}
