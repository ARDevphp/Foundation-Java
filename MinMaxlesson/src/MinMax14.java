import java.util.Scanner;

public class MinMax14 {
    public static void main(String[] args) {
        Solution(10);
    }
    public static void Solution(int n) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE, minIndex = 0;
        System.out.print("B:");
        int b = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ":");
            int number = scanner.nextInt();
            if (min > number && number > b) {
                min = number;
                minIndex = i;
            }
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println("00");
        }else {
            System.out.println(minIndex);
        }
    }
}
