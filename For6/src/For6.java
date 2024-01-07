import java.util.Scanner;

public class For6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Narxi qancha bo'lsin: ");
        double sum = scanner.nextDouble();
        solution(sum);
    }
    public static void solution(double n) {
        double sum = 1;
        for (double i = 1.2; i <= 2.0 ; i+=0.2) {
            sum = n * i;
            System.out.println(sum);
        }
    }
}
