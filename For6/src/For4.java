public class For4 {
    public static void main(String[] args) {
        konfet(4000);
    }
    public static void konfet(double sum) {
        int sum1 = 0;
        for (int i = 1; i <= 10; i++) {
            sum1 += sum;
            System.out.println(i+" kg konfet " + sum1);
        }
    }
}
