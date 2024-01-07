import java.util.Scanner;

public class For12 {
    public static void main(String[] args) {
        System.out.println(solution(4));
    }
    public static double solution(int n) {
        double s = 1;
        if (n > 0) {
            for (double i = 1.1; i <= n; i+=0.1) {
                s *= i;
                //System.out.println(s);
            }
        }
        return s;
    }
}
