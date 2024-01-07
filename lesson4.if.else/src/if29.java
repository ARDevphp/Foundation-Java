import java.util.Scanner;

public class if29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("son: ");
        int sum = scanner.nextInt();
        if (sum < 0 && sum%2==0) System.out.println("mafiy juft son");
        else if (sum < 0 && sum%2==-1) System.out.println("manfiy toq son");
        else if (sum > 0&& sum%2==0) System.out.println("musbat juft son");
        else if (sum % 2 == 1) System.out.println("musbat toq son");
        else if (sum == 0) System.out.println("son nolga teng");


    }
}
