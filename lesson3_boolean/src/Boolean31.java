import java.util.Scanner;

public class Boolean31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();
        System.out.print("C: ");
        int c = scanner.nextInt();

        boolean tengYonli = ((a == b && a != c) || (a != b && a == c) || (b == c && b != a));
        System.out.println("ten yonli uchburchak " + tengYonli);
    }
}
