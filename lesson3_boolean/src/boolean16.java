import java.util.Scanner;

public class boolean16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sonni kiriting: ");
        int sum = scanner.nextInt();
        boolean result = sum%2==0 && sum >= 10 && sum <= 99;
        System.out.println("Natija ->" + result);
    }
}
