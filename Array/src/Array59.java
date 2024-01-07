public class Array59 {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 1, 4, 6, 7, 3};
        solution(array);
    }

    public static int[] solution(int[] arr) {
        int[] b = new int[arr.length];
        b[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            b[i] = (b[i - 1] + arr[i])/2;
            System.out.println(b[i]);
        }
        return b;
    }
}
