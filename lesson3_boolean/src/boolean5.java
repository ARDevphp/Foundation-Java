import java.util.Scanner;

public class boolean5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();

        boolean result = a >= 0 || b < -2;
        System.out.println(result);
    }
}
