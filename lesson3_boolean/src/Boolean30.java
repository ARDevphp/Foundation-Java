import java.util.Scanner;

public class Boolean30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A");
        int a = scanner.nextInt();
        System.out.print("B");
        int b = scanner.nextInt();
        System.out.print("C");
        int c = scanner.nextInt();

        boolean result = a == b && b == c;
        System.out.println("Natija " + result);



    }
}
