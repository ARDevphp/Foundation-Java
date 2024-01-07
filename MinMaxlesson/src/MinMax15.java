import java.util.Scanner;

public class MinMax15 {
    // n = 2 4 1 5 6 4 6 7 8 9 10;
    // b = 2;
    // c = 8;
    //b c (0 < b < c)
    public static  void solution(int n, int b, int c) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        if (b > 0 && c > b) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + "=");
                int num = scanner.nextInt();
            }
        }
    }
}
