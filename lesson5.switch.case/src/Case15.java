public class Case15 {
    public static void main(String[] args) {
        System.out.println(solution(123));
        int a = 123;
        int b = a/100%10;
        int a1 ;
        System.out.println(b);
        System.out.println(solution(123));
    }
    public static int solution(int a) {
        int b = a/10;
        int c = b%10;
        return c;
    }
}
