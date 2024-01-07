import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();

        if (sum > 0 && sum<20) System.out.println(1);
        else System.out.println(2);
        if (sum < 3 && sum>0) System.out.println(3);
        else System.out.println(4);
    }
}
