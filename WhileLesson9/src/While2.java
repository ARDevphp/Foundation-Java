public class While2 {
    public static void main(String[] args) {
        int a = 100;
        int b = 7, count = 0;
        while (a > b) {
            a -= b;
            count++;
        }
        System.out.println(count);
    }
}
