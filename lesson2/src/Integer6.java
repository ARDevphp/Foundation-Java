import java.util.Scanner;

public class Integer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(10 <..< 99)");
        System.out.print("Ikki xonali sonni kiriting: ");
        int a = scanner.nextInt();
        int b = a/10;
        int c = a%10;
        System.out.println("10 lar xonasi ||" + b);
        System.out.println("1 lar xonasi ||" + c);

    }
}
