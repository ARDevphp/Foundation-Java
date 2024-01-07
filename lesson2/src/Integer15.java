import java.util.Scanner;

public class Integer15 {
    public static void main(String[] args) {
        /**
         * 123 -> 213
         * 453 -> 543
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("(99<...<999)");
        System.out.print("Sonni kiriting: ");
        int a = 123;//213
        int b = a/100;//1
        int d = a%100/10;//2
        int c = a%100%10;//3
        a = d*100+b*10+c;
        System.out.println(a);

    }
}
