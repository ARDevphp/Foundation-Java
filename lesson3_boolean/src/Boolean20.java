import java.util.Scanner;

public class Boolean20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.print("Sonni kriting: ");
        a = scanner.nextInt();
        int b = a/100;
        int d = a%100/10;
        int c = a%100%10;
        boolean result = b != d && d != c && c != b;
        System.out.println(result);
    }
}
