public class For14 {
    public static void main(String[] args) {
        result(5);
        result(-1);
    }
    public static void result(int n) {
        int sum = 0;
        if (n > 0) {
            for (double i = 1; i <= 2*n-1; i+=2) {
                sum += i;
                System.out.println(sum);
            }
        }else {
            System.out.println("(n > 0) shartga mos emas");
        }
    }
}
