public class For40 {
    public static void main(String[] args){
        int a = 3;
        int b = 7;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                for (int j = 1; j <= i; j++) {
                    a = j + 1;
                    System.out.print(a+"\t");
                }
                System.out.println();
            }
        }
    }
}
