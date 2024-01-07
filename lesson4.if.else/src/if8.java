import java.util.Scanner;

public class if8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son1: ");
        int son1 = scanner.nextInt();
        System.out.print("Son2: ");
        int son2 = scanner.nextInt();
        if (son1 > son2) {
            System.out.print(son1+" ");
            System.out.println(son2);
        }
        else if (son1 < son2) {
            System.out.print(son2+ " ");
            System.out.println(son1);
        }else {
            System.out.println("sonlar teng");
        }
    }
}
