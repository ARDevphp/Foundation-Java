import java.util.Scanner;

public class Boolean22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sonni kriting: ");
        int a = scanner.nextInt();
        int b = a/100;
        int d = a%100/10;
        int c = a%100%10;
        if ((b < d && d < c) || (b > d && d > c)) System.out.println("natija " + a);
        if ((b > d && d < c) || (b > d && d > c)) System.out.println("natija " + a);
    }
}
