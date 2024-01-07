public class For5 {
    public static void main(String[] args) {
        sumD(1000);
    }
    public static void sumD(double sum) {
        double sum1 = 0;
        for (double i = 0.1; i <= 1.0; i+=0.1) {
            sum1 = sum;
            sum1 *= i;
            System.out.println(i + " gram konfet " + sum1);
        }
    }
}
