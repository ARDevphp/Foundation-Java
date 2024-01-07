import java.util.Scanner;

public class MinMax16 {
    public static void main(String[] args) {
        Solution(9);
    }
    public static void Solution(int n ) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ":");
            int number = scanner.nextInt();
            if (min > number) {
                min = number;
                count++;
            }
        }
        System.out.println(min);
        System.out.println(count);
    }
}
