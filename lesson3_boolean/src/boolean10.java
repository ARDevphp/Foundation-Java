import java.util.Scanner;

public class boolean10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();

        boolean bool = ((a%2==1&&b%2==0)||(a%2==0&&b%2==1));
        System.out.println(bool);
    }
}
