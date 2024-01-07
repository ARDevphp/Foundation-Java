import java.util.Arrays;

public class Array51 {
    public static void main(String[] args) {
        int[] arrayA = {2, 6, 7, 4, 2};
        int[] arrayB = {2, 5, 8, 1, 0};
        System.out.println(Arrays.toString(arrayA) + "A");
        System.out.println(Arrays.toString(arrayB) + "B");
        solution(arrayA, arrayB);
    }

    static void solution(int[] a, int[] b) {
        int [] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
                c[i] = a[i];
                a[i] = b[i];
                b[i] = c[i];
           // System.out.println(Arrays.toString(c));
        }
        System.out.println(Arrays.toString(a) + "A");
        System.out.println(Arrays.toString(b) + "B");
    }
}
