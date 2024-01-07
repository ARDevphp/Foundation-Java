import java.util.Scanner;

public class if22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X: ");
        int x = scanner.nextInt();
        System.out.print("Y: ");
        int y = scanner.nextInt();

        if (x >= 0 && y >= 0) System.out.println("1-ckorak");
        else if (x < 0 && y >= 0) System.out.println("2-chorak");
        else if (x < 0 && y < 0) System.out.println("3-chorak");
        else if (x >= 0 && y < 0) System.out.println("4-chorak");
        else System.out.println("bunday chorak yoq");
    }
}
