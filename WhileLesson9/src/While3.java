import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        solution(65,20);
    }
    public static void solution(int n, int k) {
        int count = 0;
        while (n >= k) {
            n -= k;
            count++;
        }
        System.out.println(n);
        System.out.println(count);
    }

}
