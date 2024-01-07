public class Array18 {
    public static void main(String[] args) {
        int [] n = {7,4,5,6,7,5,8};
        System.out.println(arrayEle(n));
    }
    public static int arrayEle(int []array) {
        int oxiIndex = array.length-1;

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < oxiIndex) {
                return array[i];
            }
        }
        return 0;
    }
}
