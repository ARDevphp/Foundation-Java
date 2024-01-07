import java.util.Scanner;

public class MinMax9 {
    public static void main(String[] args) {
        MaxIndex(9);
    }
    public static void MaxIndex(int n) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int maxIndex = 0, maxIndex2 = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ":");
            int number = sc.nextInt();

            if (max < number) {
                max = number;
                maxIndex = i;
            }
            if (max <= number) {
                max = number;
                maxIndex2 = i;
            }
        }
        System.out.println("1 -> " + maxIndex);
        System.out.println("2 -> " + maxIndex2);
    }
}
