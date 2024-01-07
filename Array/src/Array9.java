public class Array9 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 8, 6, 9};//6,8,4 = 3;
        System.out.println(arrJuf(arr));
    }

    static int arrJuf(int[] arr) {
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + "\t");
                count++;
            }
        }
        System.out.println();
        return count;
    }
}
