public class Array50 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 2, 5, 1, 6, 7, 5, 2};
        solution(arr);
    }

    static void solution(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                //System.out.println(array[i]);
                count++;
                //System.out.println(count);
            }
        }
        System.out.println(count);
    }
}
