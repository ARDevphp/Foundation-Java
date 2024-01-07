import java.util.Scanner;

public class if3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son: ");
        int sum = scanner.nextInt();
        int sum2 = 10;
        if (sum > 0) {
            sum++;
            System.out.println(sum);
        } else if (sum == 0) {
            sum = sum2;
            System.out.println(sum);
        }else {
            sum--;
            sum--;
            System.out.println(sum);
        }
    }
}
