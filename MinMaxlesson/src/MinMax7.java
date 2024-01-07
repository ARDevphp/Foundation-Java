import java.util.Scanner;

public class MinMax7 {
    public static void main(String[] args) {
        Solution(9);
    }
    public static void Solution(int n) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int indexMin = 0, indexMax = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ":");
            int num = scanner.nextInt();
            if (min >= num) {
                min = num;
                indexMin = i;
            }
            if (max < num) {
                max = num;
                indexMax = i;
            }
        }
        System.out.println(min + " index kichik " + indexMin);
        System.out.println(max + " index katta " + indexMax);
    }
}
