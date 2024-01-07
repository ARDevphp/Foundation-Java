import java.util.Scanner;

public class Case6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-disimetr, 2-kilometr, 3-metr, 4-milimetr, 5-santimetr");
        System.out.print("uzunlikni kiriting: ");
        double metr = scanner.nextDouble();
        System.out.print("o'lchamni tanlang: ");
        int olcham = scanner.nextInt();
        double hajm ;

        switch (olcham) {
            // 1 - disimetr, 2 - kilometr, 3 - metr, 4 - milimetr, 5 - santimetr
            case 1 -> {
                hajm = metr/10;
                System.out.println(metr + " disimetr " + hajm + " metr");
            }
            case 2 -> {
                hajm = metr*1000;
                System.out.println(metr + " kilometr " + hajm + "  metr");
            }
            case 3 -> {
                hajm = metr*1;
                System.out.println(metr + " metr " + hajm + " metr");
            }
            case  4 -> {
                hajm = metr/1000;
                System.out.println(metr + " milimetr " + hajm + " metr");
            }
            case 5 -> {
                hajm = metr/100;
                System.out.println(metr + " santimetr " + hajm + " metr" );
            }
        }
    }
}
