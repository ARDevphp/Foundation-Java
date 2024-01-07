import java.util.Scanner;

public class Integer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(A > B)");
        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();
        int c = a/b;
        System.out.println("A kesmada B kesmani || " + c + " || marta joylashtirsa boladi");
    }
}
