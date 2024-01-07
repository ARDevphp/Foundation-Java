import java.util.Scanner;

public class if15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son1: ");
        int a = scanner.nextInt();
        System.out.print("Son2: ");
        int b = scanner.nextInt();
        System.out.print("Son3: ");
        int c = scanner.nextInt();
        a += a;//
        b += b;//
        c += c;
        if (a > b && a > c) System.out.println(a);
        else if (b > a && b > c) System.out.println(b);
        else if (c > a && c > b) System.out.println(c);
        if (a > b && a < c || a < b && a > c) System.out.println(a);
        else if (b > a && b < c || b < a && b > c) System.out.println(b);
        else if (c > a && c < b || c < a && c > b) System.out.println(c);
    }
}
