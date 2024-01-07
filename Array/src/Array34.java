public class Array34 {
    public static void main(String[] args) {
        int[] n = {3, 55, 4, 55, 93, 5, 9, 8, 9, 5, 7};
        solution(n);
    }

    public static void solution(int[] arr) {
        int max = arr[2];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1] > arr[i] && arr[i + 1] > arr[i]) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
        }
        System.out.println(max);
    }
}
