public class For20 {
    public static void main(String[] args) {
        System.out.println(foktarial(5));
        //1+2+6+24+120=153
    }
    public static int foktarial(int n) {
        int fack = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            fack *=i;
            sum += fack;
        }
        return sum;
    }
}
