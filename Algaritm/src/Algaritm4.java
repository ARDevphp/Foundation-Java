import java.util.Scanner;

public class Algaritm4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int foc, n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
           n = n * i;
           System.out.println(n);
        }
    }
}
