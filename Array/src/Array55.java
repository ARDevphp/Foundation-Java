public class Array55 {
    public static void main(String[] args) {
        int [] a = new int[] {1,4,6,7,3,4,6,7,2,5};
        solution(a);
     }
    static void solution(int[] arr) {
        int count = 0;
        int [] b = new int[arr.length];

        for (int i = 1; i < arr.length; i+=2) {
            b[i] = arr[i];
            count++;
            System.out.println(b[i]);
        }
        System.out.println(count);
    }
}
