public class Example1 {
    public static void main(String[] args) {
        int n = 5;
        int a = 2;
        int sum1;
        int sum = 1;
        for (int i = 1; i <=n ; i++) {
            sum1 = sum * a;
            sum *= sum1;
            System.out.println(sum1);
        }
    }
}
