import java.util.Scanner;

public class if1 {
    /**
     * a > 0 , a++ yoki a < 0, a == a;
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int butunSon = scanner.nextInt();
        if (butunSon > 0) {
            butunSon++;
            System.out.println(butunSon);
        }
        else {
            System.out.println(butunSon);
        }
    }
}
