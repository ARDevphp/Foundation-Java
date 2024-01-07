import java.util.Scanner;

public class Case16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sonni kiriting: 10... 99 ");
        int sum1 = scanner.nextInt();
        sonToliq(sum1);
    }
    public static void sonToliq(int num) {
        int sum = num/10;
        int sum1 = num%10;
        birlik2(sum);
        birlik(sum1);
    }
    public static void birlik2 (int birlik2) {
        switch (birlik2) {
                case 1 -> System.out.print("O'n");
                case 2 -> System.out.print("Yigirma");
                case 3 -> System.out.print("O'tiz");
                case 4 -> System.out.print("Qirq");
                case 5 -> System.out.print("Ellik");
                case 6 -> System.out.print("Oltmush");
                case 7 -> System.out.print("Yetmush");
                case 8 -> System.out.print("Sakson");
            case 9 -> System.out.print("To'qson");
        }
    }
    public static void birlik(int birlik) {
        if (birlik < 0 && birlik > 9) {
            System.out.print("ortiq son kiritildi");
        }else {
            switch (birlik) {
                case 1 -> System.out.print(" bir");
                case 2 -> System.out.print(" ikki");
                case 3 -> System.out.print(" uch");
                case 4 -> System.out.print(" to'rt");
                case 5 -> System.out.print(" besh");
                case 6 -> System.out.print(" oltti");
                case 7 -> System.out.print(" yetti");
                case 8 -> System.out.print(" sakkiz");
                case 9 -> System.out.print(" to'qqiz");
            }
        }
    }
}
