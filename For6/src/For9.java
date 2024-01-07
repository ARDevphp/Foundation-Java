public class For9 {
    public static void main(String[] args) {
        solution(5,8);
    }
    public static void solution(int a, int b){
        int sum;
        int natija = 0;
        for (int i = a; i <= b; i++) {
            sum = i*4;
            natija += sum;
            System.out.println(sum);
            System.out.println(natija);
        }
    }
}
