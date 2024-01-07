import java.util.Scanner;

import static java.lang.System.in;

public class Integer16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int a = 253;//132
        int b = a/100;//1
        int d = a%100/10;//2
        int c = a%100%10;//3
        a = b*100+c*10+d;
        System.out.println(a);
    }
}
