public class For19 {
    public static void main(String[] args) {
        faktorial(5);
    }
    public static void faktorial(int n){
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
