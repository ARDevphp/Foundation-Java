import java.util.Scanner;

public class Boolean29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();
        System.out.print("x1: ");
        int x1 = scanner.nextInt();
        System.out.print("y1: ");
        int y1 = scanner.nextInt();
        System.out.print("x2: ");
        int x2 = scanner.nextInt();
        System.out.print("y2: ");
        int y2 = scanner.nextInt();

        boolean bool = ((x1 < x && x < x2 ) && (y1 < y && y < y2));
        System.out.println(bool);
    }
}
