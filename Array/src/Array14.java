public class Array14 {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 56, 2, 5, 6, 7, 5, 9};
        solution(a);
    }

    static void solution(int[] array) {
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + "\t");
        }
    }
}
