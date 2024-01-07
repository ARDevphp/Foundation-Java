import java.util.Scanner;

public class MinMax3 {
    public static void main(String[] args) {
        solution(6);
    }

    public static void solution(int n) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "-To'rtburchakni kriting");
            System.out.print("A:");
            int a = scanner.nextInt();
            System.out.print("B:");
            int b = scanner.nextInt();
            sum = a + b;
            if (max < sum) max = sum;
            System.out.println(sum);
        }
        System.out.println(max);
    }
}
