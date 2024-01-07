import java.util.Scanner;

public class Integer14 {
    /**
     * 123 -> 312
     * 345 -> 534
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(99<...>999)");
        System.out.print("Sonni kiriting: ");
        int a = scanner.nextInt();
        int b = a/10;//123/10=12
        int d = a%10;//123%10=3
        a = d*100+b;//3*100+12=312
        System.out.println(a);
    }
}
