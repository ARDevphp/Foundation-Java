import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class MinMax10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N:");
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minI = 0, maxI = 0;

        for (int i = 1; i <=n ; i++) {
            System.out.print(i + " ");
            int number = sc.nextInt();

            if (min > number) {
                min = number;
                minI = i;
            }
            if (max < number) {
                max = number;
                maxI = i;
            }

        }
        if (minI < maxI) System.out.println(minI);
        else if (minI > maxI)System.out.println(maxI);
    }
}