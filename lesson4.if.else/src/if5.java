import java.util.Scanner;

public class if5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son1: ");
        int a = scanner.nextInt();
        System.out.print("Son2: ");
        int b = scanner.nextInt();
        System.out.print("Son3: ");
        int c = scanner.nextInt();
        int count = 0,count1 = 0;

        if (a > 0) {
            count++;
        }else {
            count1++;
        }
        if (b > 0){
            count++;
        }else {
            count1++;
        }
        if (c > 0) {
            count++;
        }else {
            count1++;
        }
        System.out.println(count + " ta musbat son bor");
        System.out.println(count1 + " ta manfiy son bor");
    }
}
