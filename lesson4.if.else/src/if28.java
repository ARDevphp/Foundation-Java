import java.util.Scanner;

public class if28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yilni kiriting: ");
        int iskabisa = scanner.nextInt();//1300
        if (iskabisa % 4 != 0) System.out.println(iskabisa + " yil kabisa yili 366 kun bor");
        else if (iskabisa % 400 == 0) System.out.println(iskabisa + " yil kabisa yili emas 365 kun bor");
        else if (iskabisa % 100 != 0)System.out.println("salom");


    }
}
