import java.util.Scanner;

public class Integer26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("kuni kiriting: ");
        int k = scanner.nextInt();
        int year = k%7+1;
        System.out.println("kun " +year);
    }
}
