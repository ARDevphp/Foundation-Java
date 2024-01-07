import java.util.Scanner;

public class MinMax2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N.T:");
        int nTop = sc.nextInt();
        int min = Integer.MAX_VALUE, sum = 0;
        for (int i = 1; i <= nTop; i++) {
            System.out.println(i+":");
            System.out.print("A tamon:");
            int a = sc.nextInt();
            System.out.print("B tamon:");
            int b = sc.nextInt();
            sum = a * b;
            if (min > sum) min = sum;
            System.out.println(sum);
        }
        System.out.println(min);
    }
}
