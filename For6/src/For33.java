public class For33 {
    public static void main(String[] args) {
        System.out.println("Fibanachi ketma ketligining n ta hadi ");
        solution(10);
    }

    public static void solution(int n) {
        int f1 = 1, f2 = 1, fn;
        for (int i = 1; i <= n; i++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
            System.out.println(f2);
        }
    }
}
