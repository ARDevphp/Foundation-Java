public class Array8 {
    public static void main(String[] args) {
        int []n = {4,5,7,8,6,9};// 5,7,9 = 3;
        System.out.println(arrIndex(n));
    }
    static int arrIndex(int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                count++;
                System.out.print(arr[i] + "\t");
            }
        }
        System.out.println();
        return count;
    }
}
