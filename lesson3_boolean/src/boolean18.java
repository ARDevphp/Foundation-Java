import java.util.Scanner;

public class boolean18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son 1: ");
        int a = scanner.nextInt();
        System.out.print("Son 2: ");
        int b = scanner.nextInt();
        System.out.print("Son 3: ");
        int c = scanner.nextInt();
        // 2, 4, 2 true;
        // 4, 6, 3 false;
        boolean result = (a == b || b == c || a == c);
        System.out.println(result);
    }
}
