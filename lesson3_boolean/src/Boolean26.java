import java.util.Scanner;

public class Boolean26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X ");
        int x = scanner.nextInt();
        System.out.print("Y ");
        int y = scanner.nextInt();
        boolean bool = x > 0 && y < 0;
        System.out.println(bool);
    }
}
