import java.util.Scanner;

public class Integer25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("kuni kiriting: ");
        int k = scanner.nextInt();
        int year = (k+3)%7;
        System.out.println(year);

    }
}
