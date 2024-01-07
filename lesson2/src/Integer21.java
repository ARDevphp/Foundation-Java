import java.util.Scanner;

public class Integer21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("O'tgan sekundni  N: ");
        int n = scanner.nextInt();
        int minute = n/60;
        n = minute*60;
        System.out.println("kun boshidan boshlab "+minute+" minut o'tdi");
        System.out.println("kun boshidan boshlab "+n+" sekund o'tdi");
        System.out.println();
    }
}
