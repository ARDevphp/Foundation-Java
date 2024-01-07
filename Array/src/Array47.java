public class Array47 {
    public static void main(String[] args) {
        int[] n = {7, 4, 2, 3, 1, 4, 5, 2, 4, 7};
        solution(n);
    }
    static void solution(int []array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            boolean bor = false;
            for (int j = 0; j < i; j++) {
                bor = bor || element == array[j];
            }
            if (!bor) {
                count++;
                System.out.print(element + " dan ");
            }
        }

    }
}
