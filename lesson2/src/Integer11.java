import java.util.Scanner;

public class Integer11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uvh xonali sonni kiriting: ");
        int a = scanner.nextInt();
        int b = a/100;//yuzlar xonasi
        int c = a%100/10;//O'nlar xonasi
        int d = a%100%10;//birlar xonasi
        int natija = b+c+d;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(natija);

    }
}
