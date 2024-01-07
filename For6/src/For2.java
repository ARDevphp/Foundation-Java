public class For2 {
    public static void main(String[] args) {
        solution(3, 8);
        solution(11, 18);
        solution(11, 10);
    }
    public static void solution(int a, int b) {
        int count = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
                count++;
            }
            System.out.println(count);
        } else {
            System.out.println("not off");
        }
    }
}
