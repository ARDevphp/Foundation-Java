import java.util.Scanner;

public class if11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();
        int c = 0;
        if (a > b){
            b = a;
            System.out.println(a);
            System.out.println(b);
        } else if (a < b) {
            a = b;
            System.out.println(a);
            System.out.println(b);
        } else {
            a = c;
            b = c;
            System.out.println(a);
            System.out.println(b);
        }
    }
}
