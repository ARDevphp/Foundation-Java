import java.util.Scanner;

public class boolean17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("uch xonali sonni kiriting: ");
        int sum = scanner.nextInt();

        boolean result = sum>99 && sum < 1000 && sum%2==1;
        System.out.println(result);
    }
}
