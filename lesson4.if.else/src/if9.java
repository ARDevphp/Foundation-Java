import java.util.Scanner;

public class if9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        double a = scanner.nextInt();
        System.out.print("B: ");
        double b = scanner.nextInt();
        double c;

        if (a > b) {
            c = a;
            a = b;
            b = c;
            System.out.println("a " + a);
            System.out.println("b " + b);
        }else {
            System.out.println("a "+ a);
            System.out.println("b "+ b);
        }
    }
}
