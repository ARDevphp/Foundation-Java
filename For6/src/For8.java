public class For8 {
    public static void main(String[] args) {
        solution(1,5);
    }
    public static void solution(int a, int b) {
        int sum = 1;
        for (int i = a; i <= b; i++) {
            sum *= i;
            System.out.println(sum);
        }
    }
}
