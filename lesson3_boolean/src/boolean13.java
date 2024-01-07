import java.util.Scanner;

public class boolean13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();
        System.out.print("C: ");
        int c = scanner.nextInt();

        boolean result = a > 0 || b > 0 || c > 0;
        System.out.println(result);
    }
}
