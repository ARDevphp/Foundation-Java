import java.util.Scanner;

public class Algaritm3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinchi sonni kiriting: ");
        int a = scanner.nextInt();
        System.out.print("Ikkinchi sonni kiriting: ");
        int b = scanner.nextInt();
        System.out.print("Uchinchi sonni kiriting: ");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("Kattasi " + a);
        }
        if (b > a && b > c) {
            System.out.println("Kattasi " + b);
        }
        if (c > a && c > b) {
            System.out.println("Kattasi " + c);
        }
        if (a == b) {
            if (a != c) {
                System.out.println("Birinchi va ikkinchi sonlar teng " + a + " | " + b);
            }
        }
        if (a == c) {
            if (a != b) {
                System.out.println("Birinchi va uchunchi sonlar teng " + a + " | " + c);
            }
        }
        if (c == b) {
            if (c != a){
                System.out.println("Ikkinchi va uchunchi sonlar teng " + c + " | " + b);
            }
        }
        if (a == b && b == c && a == c){
            System.out.println("Sonlar barchasi teng " + a);
        }
    }
}