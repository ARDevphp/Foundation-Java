import java.util.Scanner;

public class boolean2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        int a = scanner.nextInt();
        boolean bool = a%2==1;
        System.out.println(bool);


    }
}
