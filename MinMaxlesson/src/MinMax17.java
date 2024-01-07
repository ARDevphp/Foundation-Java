import java.util.Scanner;

public class MinMax17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int min = Integer.MAX_VALUE;//2147483647
        int max = Integer.MIN_VALUE;//-2147483647
        int n,index=0;
        System.out.print ("n= ");//5
        n = scanner.nextInt ( );
        for (int i = 1; i <= n; i++) {//1
            System.out.print (i + " = ");
            int number = scanner.nextInt ( );
            if ( max < number ) {//12//
                max = number; // min = 12
                index=i;
            }
        }
        System.out.println ("Undan oldin "+(index-1)+" ta son bolgan");
    }
}
