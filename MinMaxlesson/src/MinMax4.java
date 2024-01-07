import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class MinMax4 {
    public static void main(String[] args) {
        Solution(9);
    }
    public static void Solution(int n){
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE, index = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i+":");
            int number = sc.nextInt();
            if (min > number) {
                min = number;
                index = i;
            }
        }
        System.out.println("eng kichigi " + min);
        System.out.println("eng kichigini indexkisi " + index);
    }
}
