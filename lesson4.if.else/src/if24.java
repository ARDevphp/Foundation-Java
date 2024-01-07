import java.util.Scanner;

public class if24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fx,x = scanner.nextDouble();
        System.out.print("x: ");

        if (x > 0) {
            fx = 2*Math.sin(x);
        }
        else {
            fx = x-6;
        }
        System.out.println(fx);

    }
}
