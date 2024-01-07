import java.util.Scanner;

public class if6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son1: ");
        int son1 = scanner.nextInt();
        System.out.print("Son2: ");
        int son2 = scanner.nextInt();
        if (son1 > son2) {
            System.out.println("Son1 katta Son2 dan  " + "( " + son1+ " )");
        }else if (son1 < son2) {
            System.out.println("Son2 katta Son1 dan  " + " ( " + son1 + " )");
        }
    }
}
