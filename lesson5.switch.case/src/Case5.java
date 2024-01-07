import java.util.Scanner;

public class Case5 {
    /**
     * a va b haqiqiy son
     * butun son 1,2,3,4,
     * 1 -> qo'shish
     * 2 -> ayrish
     * 3 -> bo'lish
     * 4 -> ko'paytirish
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        double a = scanner.nextDouble();
        System.out.print("B: ");
        double b = scanner.nextDouble();
        int sum = scanner.nextInt();

        switch (sum) {
            case 1:
                 a = a + b;
                System.out.println("a+b="+a);
                break;
            case 2:
                a = a - b;
                System.out.println("a-b="+a);
                break;
            case 3:
                a = a / b;
                System.out.println("a/b="+a);
                break;
            case 4:
                a = a * b;
                System.out.println("a*b="+a);
                break;
        }


    }
}
