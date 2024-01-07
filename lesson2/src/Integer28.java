import java.util.Scanner;

public class Integer28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 dan 7 gacha hafta kunlarini kiriting: ");
        int n = scanner.nextInt();
        System.out.print("kunni kiriting: ");
        int k = scanner.nextInt();
        int year = (k+n-2)%7+1;
        System.out.println(year);
    }
}
