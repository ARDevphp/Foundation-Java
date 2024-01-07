import java.util.Scanner;

public class MinMax8 {
    public static void main(String[] args) {
        MinIndex(8);
    }

    public static void MinIndex(int n) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int indexMin = 0, index1 = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i+":");
            int num = sc.nextInt();

            if (min > num) {
                min = num;
                indexMin = i;
            }
            if (min >= num) {
                min = num;
                index1 = i;
            }
        }
        System.out.println("1 -> " + indexMin);
        System.out.println("2 -> " + index1);
    }
}
