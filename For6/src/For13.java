public class For13 {
    public static void main(String[] args) {
        solution(3);
    }
    public static void solution(int n) {
        double sum = 0;
        int result = 1;
        for (double i = 1.1; i <= n; i+=0.1) {
            sum += result * i ;
            result *= -1;
            System.out.println(sum);
            System.out.println(result);
        }
        //System.out.println(sum);
    }
}
