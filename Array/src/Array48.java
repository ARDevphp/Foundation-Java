public class Array48 {
    public static void main(String[] args) {
        int[] n = {7, 4, 2, 3, 1, 4, 5, 2, 4, 7};
        solution(n);
    }

    static void solution(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int borimi = array[i];
            for (int j = 0; j < i; j++) {
                if (borimi == array[j]) {
                    //borimi = array[i];
                    count++;
                    System.out.println(borimi + " " + count);
                }
            }
        }
        System.out.println(count);
    }
}
