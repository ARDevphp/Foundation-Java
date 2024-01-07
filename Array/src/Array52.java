public class Array52 {
    public static void main(String[] args) {
        int[] array = {3, 1, 5, 6, 3};
        solution(array);
    }

    static void solution(int[] arr) {
        int[] b = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 5) {
                b[i] = 2 * arr[i];
                System.out.println(b[i]);
            } else {
                b[i] = arr[i] / 2;
                System.out.println(b[i]);
            }
        }
    }
}
