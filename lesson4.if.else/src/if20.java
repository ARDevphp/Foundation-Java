import java.util.Scanner;

public class if20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();
        System.out.print("C: ");
        int c = scanner.nextInt();

        int sum = a - b;
        int sum1 = a - b;

        if (a < b && b < c) System.out.printf("A nuqtaga eng yaqin nuqta || B nuqta oraliq masofasi -> " + sum);
        else if (a > b && b > c) System.out.printf("A nuqtaga eng yaqin nuqta || B nuqta oraliq masofasi -> " + sum);
        if (a < c && b > c) System.out.println("A nuqtaga eng yaqin nuqta || C nuqta oraliq masofasi -> " + sum1);
        else if (a > c && b < c) System.out.println("A nuqtaga eng yaqin nuqta || C nuqta oraliq masofasi -> " + sum1);
    }
}
