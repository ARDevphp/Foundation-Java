public class Array40 {
    public static void main(String[] args) {
        int[] n = {5, 1, 2, 3, 5, 7, 1, 8};
        System.out.println(solution(n, 6));
    }

    public static int solution(int[] array, int r) {

        for (int i = 1; i < array.length; i++) {
            if (r == array[i]) return array[i];
            else if (r > array[i]) {
                int result = 0;
                if (result < r - array[i - 1]) {
                    result = array[i];
                    System.out.println(result + " re");
                    System.out.println(array[i] + "[ i]");
                }
            }
        }
        return 0;
    }
}
