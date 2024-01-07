public class Array32 {
    public static void main(String[] args) {
        int []arr = {2,4,2,3,4,6,2,4,7,4};
        System.out.println(arrayLocalMin(arr));
    }
    static int arrayLocalMin(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i-1] && array[i] < array[i+1]){
                return i;
            }
        }
        return -1;
    }
}
