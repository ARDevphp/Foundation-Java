public class For39 {
    public static void main(String[] args) {
        solution(3,8);
    }
    public static void solution(int a, int b){
        if (a < b) {
            for (int i = a; i <= b; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + "\t");
                }
                System.out.println("");
            }
        }
    }
}
