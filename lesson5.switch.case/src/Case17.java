import java.util.Scanner;

public class Case17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Raqamni kiriting: ");
        int test = scanner.nextInt();

        switch (test) {
            case 10,11,12,13,14,15,16,17,18,19 -> {
                System.out.println("o'n");
                switch (test) {
                    case 1 -> System.out.println("bir");
                    case 2 -> System.out.println("ikki");
                    case 3 -> System.out.println("uch");
                    case 4 -> System.out.println("to'rt");
                    case 5 -> System.out.println("besh");
                    case 6 -> System.out.println("olti");
                    case 8 -> System.out.println("Skkiz");
                    case 9 -> System.out.println("to'qqiz");
                }
            }
        }

    }
}
