import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Oyni kiriting 1..12 -> ");
        int month = scanner.nextInt();

        switch (month) {
            case 1,3,5,7,8,10,12:
                System.out.println("bu oyda " + 31 + " kun bor");
                break;
            case 4,6,9,11:
                System.out.println("bu oyda " + 30 + " kun bor");
                break;
            case  2:
                System.out.println("bu oyda " + 28 + " kun | Kabisa bo'lsa " + 29 + " kun bor");
                break;
        }


    }
}
