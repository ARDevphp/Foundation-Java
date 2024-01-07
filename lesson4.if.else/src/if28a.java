import java.util.Scanner;

public class if28a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yilni kiriting: ");
        int year = scanner.nextInt();

        if (year%4!=0) System.out.println(year + " no kabisa" );
        else if (year%400==0) System.out.println(year + " yil kabisa yil 366 kun bor");
        else if (year%100==0) System.out.println(year + " nokabisa 365 dey");
    }
}
