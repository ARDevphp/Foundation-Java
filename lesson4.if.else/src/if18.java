import java.util.Scanner;

public class if18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son1: ");
        int son1 = scanner.nextInt();
        System.out.print("Son2: ");
        int son2 = scanner.nextInt();
        System.out.print("Son3: ");
        int son3 = scanner.nextInt();

        if (son1 == son2) System.out.println("son 3 ||" + son3);
        else if (son1 == son3) System.out.println("son 2 ||" + son2);
        else if (son2 == son3) System.out.println("son 1 ||" + son1);
        else System.out.println("sonlar teng");
    }
}
