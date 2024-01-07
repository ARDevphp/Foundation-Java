public class Array56 {
    public static void main(String[] args) {
        int[] n = {2, 3, 1, 4, 5, 6, 3, 2, 7, 8, 34, 12, 31, 14, 16};
        solution(n);
    }

    static void solution(int[] arr) {
        int count = 0;
        int[] b = new int[arr.length];
        for (int i = 0; i < arr.length; i += 3) {
            b[i] = arr[i];
            count++;
            System.out.println(b[i]);
        }
        System.out.println(count);
    }
}
