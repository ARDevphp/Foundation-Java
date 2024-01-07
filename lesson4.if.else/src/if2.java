import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son: ");
        int son = scanner.nextInt();
        if (son > 0) {
            son++;
            System.out.println(son);
        }else {
            son--;
            son--;
            System.out.println(son);
        }


    }
}
