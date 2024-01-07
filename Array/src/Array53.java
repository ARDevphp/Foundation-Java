import java.util.Arrays;

public class Array53 {
    public static void main(String[] args) {
        int[] a = {3, 5, 6, 7, 8, 9, 0, 4, 3, 5};
        int[] b = {4, 2, 6, 4, 3, 5, 6, 4, 2, 5};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        solution(a, b);
    }

    static void solution(int[] a, int[] b) {
        int [] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= b[i]) {
                c[i] = a[i];
            }
            else if (b[i] > a[i]) {
                c[i] = b[i];
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
