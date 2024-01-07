public class While4 {
    public static void main(String[] args) {
        solution(9);

    }
    public static void solution(int n) {
        int i = 1;
        int sum = 1;
        while (i <= n) {
            sum *= i;
            System.out.println(i+" = "+sum);
            i++;
        }
        if (n == sum/3) {
            System.out.println("3ni darajasi");
        }else System.out.println("3ni darajasi emas");
    }
}
