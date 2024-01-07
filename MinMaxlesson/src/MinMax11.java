import java.util.Scanner;

public class MinMax11 {
    public static void main(String[] args) {
        Ekstremal(9);
    }
    public static void Ekstremal(int n) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minI = 0, maxI = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i+":");
            int number = scanner.nextInt();

            if (min >= number) {
                min = number;
                minI = i;
            }
            if (max <= number) {
                max = number;
                maxI = i;
            }
        }
        if (min <= max) System.out.println(minI);
        else if (min >= max) System.out.println(maxI);
    }
}
