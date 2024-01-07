import java.util.Scanner;

public class Integer23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N vaqtni kriting: ");
        int n = scanner.nextInt();
        int minute = n/60;
        int chas = minute/60;
        minute = chas*60;
        n = minute*60;
        System.out.println("kun boshidan boshlab "+chas+" soat o'tdi");
        System.out.println("kun boshidan boshlab "+minute+" minut o'tdi");
        System.out.println("kun boshidan boshlab "+n+" sekund o'tdi");


    }
}
