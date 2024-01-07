public class Array39 {
    public static void main(String[] args) {
        int[] n = {5, 2, 1, 6, 4, 3, 2, 3, 4, 5, 6, 5, 4, 3, 4,8,7};
        solution(n);
    }
    public static void solution(int []array) {
        int count = 0;

        for (int i = 1; i < array.length; i++) {

            if (i != array.length-1) {
                boolean osiSH = array[i] > array[i-1] && array[i] > array[i+1];//3
                boolean kamaYsh = array[i] < array[i-1] && array[i] < array[i+1];//3
                if (osiSH) {
                    count++;
                }
                if (kamaYsh) {
                    count++;//2
                }
            }else {
                if (array[i] > array[i-1]) {
                    count++;
                }else if (array[i] < array[i-1]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
