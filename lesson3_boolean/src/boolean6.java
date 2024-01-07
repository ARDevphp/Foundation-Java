import java.util.Scanner;

public class boolean6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();
        System.out.print("C: ");
        int c = scanner.nextInt();

        boolean bool = a <= b && b <= c;
        System.out.println(bool);
    }
}
