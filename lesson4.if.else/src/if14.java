import java.util.Scanner;

public class if14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son1: ");
        int a = scanner.nextInt();
        System.out.print("Son2: ");
        int b = scanner.nextInt();
        System.out.print("Son3: ");
        int c = scanner.nextInt();

        if (a >= b && a >= c){
            if (b > c) {
                System.out.println(c);
                System.out.println(a);
            }else {
                System.out.println(b);
                System.out.println(a);
            }
        } else if (b >= a && b >= c) {
            if (a > c) {
                System.out.println(c);
                System.out.println(b);
            }
            else {
                System.out.println(a);
                System.out.println(b);
            }
        } else {
            if (b > a) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
            System.out.println(c);
        }
    }
}
