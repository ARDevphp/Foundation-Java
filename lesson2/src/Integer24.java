import java.util.Scanner;

public class Integer24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 dan 365gacha oraliqdagi kunni kiriting: ");
        int k = scanner.nextInt();
        int year = k%7;
        System.out.println(year);

    }
}
