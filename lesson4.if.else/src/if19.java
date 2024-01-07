import java.util.Scanner;

public class if19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son1: ");
        int son1 = scanner.nextInt();
        System.out.print("Son2: ");
        int son2 = scanner.nextInt();
        System.out.print("Son3: ");
        int son3 = scanner.nextInt();
        System.out.print("Son4: ");
        int son4 = scanner.nextByte();

        if (son1 == son2 && son1 == son3) System.out.println("4-son " + son4);
        else if (son1 == son2 && son1 == son4) System.out.println("3-son " + son3);
        else if (son1 == son3 && son1 == son4) System.out.println("2-son " + son2);
        else if (son2 == son3 && son2 == son4) System.out.println("1-son " + son1);
    }
}
