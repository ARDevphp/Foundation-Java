import java.util.Scanner;

public class Integer27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("kuni kiriting: ");
        int k = scanner.nextInt();
        int year = (k+5)%7+1;
        System.out.println(year);
    }
}
