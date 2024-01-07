import java.util.Scanner;

public class Boolean34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1..8 oraliqni kiriting: ");
        System.out.print("X: ");
        int x = scanner.nextInt();
        System.out.print("Y: ");
        int y = scanner.nextInt();

        boolean bool = ((x > 0 && x < 9 && y > 0 && y < 9 ) && (x%2==1 && y%2==1) || (x%2==0&&y%2==0));
        System.out.println(bool);
    }
}
