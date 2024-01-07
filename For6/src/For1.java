public class For1 {
    public static void main(String[] args) {
        solution(4,10);
        solution(3,15);
    }
    public static void solution(int k, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d:%d\n",i,k);
        }
    }
}
