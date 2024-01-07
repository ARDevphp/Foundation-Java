import java.util.Scanner;

public class if30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("son 1....999 oraliqda kiriting: ");
        int sum = scanner.nextInt();

        if (sum > 0 && sum <= 9) System.out.println("bir xonali son");
        else if (sum >= 10 && sum <= 99) System.out.println("ikki xonalik son");
        else if (sum >= 100 && sum <= 999) System.out.println("uch xonalik son");

        }

    }
