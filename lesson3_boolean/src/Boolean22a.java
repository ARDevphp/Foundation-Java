import java.util.Scanner;

public class Boolean22a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sonni kriting: ");
        int a = scanner.nextInt();
        int b = a/100;
        int d = a%100/10;
        int c = a%100%10;
        int count = 0;
        int count1 = 0;
        boolean bool = b < d && d < c;
        boolean bool1 = b > d && d > c;
        if (!bool) {
            count++;
            System.out.println("Natija kamayuvchi " + bool1 + " " + a + " " + count);}

        if (!bool1) {
            count1++;
            System.out.println("Natija o'suvchi " + bool + " " + a + " " + count1);
        }
    }
}
