public class Array58 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 4, 3, 5, 2};
        solution(arr);
    }

    static int[] solution(int[] arr) {
        int[] b = new int[arr.length];
        b[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            b[i] = b[i - 1] + arr[i];

            System.out.println(b[i]);
        }
        return b;
    }
}
