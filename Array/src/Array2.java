import java.lang.reflect.Array;

public class Array2 {
    public static void main(String[] args) {
        array2(6);
    }
    static int array2(int n) {
        int [] array = new int[n];
        int sum = 1;
        for (int i = 0; i < n; i++) {
            array[i] = sum;
            sum *= 2;
        }
        ArrayUtil.show(array);
        return n;
    }
}
