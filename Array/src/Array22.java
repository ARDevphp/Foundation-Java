public class Array22 {
    public static void main(String[] args) {
        int []array = {1,1,7,1,6,7,2,1,3,2};
                     //0 1 2 3 4 5 6 7 8 9
        arrayTas(array,2,8);
    }
    static void arrayTas(int []arr, int k, int l) {
        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i <= k; i++) {
            sum += arr[i];
        }
        for (int i = l; i < arr.length; i++) {
            sum1 += arr[i];
        }
        sum += sum1;

        System.out.println(sum);
    }
}
