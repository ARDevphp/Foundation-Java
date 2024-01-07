public class Array15 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 2, 1, 7, 8, 5, 4};
        Solution15(arr);
    }

    static void Solution15(int[] array) {
        //toq;
        System.out.print("juft index ");
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        System.out.print("toq index ");
        //juft
        for (int i = array.length - 2; i > 0; i -= 2) {
            System.out.print(array[i] + "\t");
        }
    }
}
