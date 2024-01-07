import java.util.Scanner;

public class MinMax1 {
    public static void main(String[] args) {
        Solution(4,7);
    }
    public static void Solution(int nSon, int nTop) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= nTop; i++) {
            System.out.print(i+"=");
            int number = scanner.nextInt();
            if (min > number) min = number;
            if (max < number) max = number;
        }
        System.out.println(min);
        System.out.println(max);
    }
}
