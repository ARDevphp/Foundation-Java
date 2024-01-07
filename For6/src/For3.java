public class For3 {
    public static void main(String[] args) {
        solution(3,5);
        solution(3,8);
    }
    public static void solution(int a, int b) {
        int count = 0;
        if (a < b) {
            for (int i = b-1; i > a; i--) {
                System.out.println(i);
                count++;
            }
            System.out.println(count);
        }
    }
}
