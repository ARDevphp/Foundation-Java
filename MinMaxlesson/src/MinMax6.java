import java.util.Scanner;

public class MinMax6 {
    // 4 5 2 4 1 5 9 8 9-> 5 9
    public static void main(String[] args) {
        Solution(9);
    }
    public static void Solution(int n) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int index1 = 0, index2 = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i+":");
            int num = scanner.nextInt();
            if (min > num) {
                min = num;
                index1 = i;
            }
            if (max <= num) {
                max = num;
                index2 = i;
            }
        }
        System.out.println("eng kichik index " + index1 + " " + min);
        System.out.println("eng katta index " + index2 + " " + max);
    }
}
