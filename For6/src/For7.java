public class For7 {
    public static void main(String[] args) {
        Solution(1,9);//1+2+3+4+5+6+7+8+9 = 45   1+2=3+
    }
    public static void Solution(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
            System.out.println(sum);
        }
    }
}
