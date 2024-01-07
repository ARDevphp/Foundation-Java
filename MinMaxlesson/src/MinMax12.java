import java.util.Scanner;

public class MinMax12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 6;
        int min = Integer.MAX_VALUE, son = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ":");
            int num = scanner.nextInt();
            if (min > num && num > 0) {
                min = num;
            }
        }
        if (min == Integer.MAX_VALUE) {
            min = 0;
            System.out.println(min);
        }else {
            System.out.println(min);
        }
    }
}
