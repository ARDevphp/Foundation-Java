public class While1 {
    public static void main(String[] args) {
        solution(100,6);
    }
    public static void solution(int a, int b) {
        while(a > b) {
            a -= b;
        }
        System.out.println(a);
    }
}
