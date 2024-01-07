public class Example {
    public static void main(String[] args) {
        double a = 4800;
        double sum = 0;
        for (double i = 0.1; i <= 1.0; i+=0.1) {
            sum = a / i;
            System.out.println(sum);
        }
    }
}
