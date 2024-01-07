import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("K: ");
        int k = scanner.nextInt();

        switch (k){
            case 1 -> System.out.println("yomon");
            case 2 -> System.out.println("qoniqarsiz");
            case 3 -> System.out.println("qoniqarli");
            case 4 -> System.out.println("yaxshi");
            case 5 -> System.out.println("alo");
            default -> System.out.println("xato");
        }


    }
}
