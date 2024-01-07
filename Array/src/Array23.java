public class Array23 {
    public static void main(String[] args) {
        int [] n = {1,4,7,10,13,17,21,24,27};
        int [] n1 = {2,34,3,2,3,4,5,33,2};
        solution1(n);
        solution2(n);
        solution1(n1);
        solution2(n1);
    }

    public static int solution1(int[] array) {
        if (array.length == 0 || array.length == 1) return 0;
        int d = array[1] - array[0];
        int count = 1;
        for (int i = 2; i < array.length; i++) {
            count++;
            if (array[i] - array[i - 1] != d) {
                System.out.println("usul 1 " + count);
                return 0;
            }
        }
        System.out.println("usul 1 " + count);
        return d;
    }

    public static int solution2(int[] array) {
        if (array.length == 0 || array.length == 1) {
            return 0;
        }
        int d = array[1] - array[0];
        int count = 1;
        boolean bool = true;
        for (int i = 2; i < array.length; i++) {
            count++;
            bool = bool&&array[i] - array[i-1]==d;
        }
        System.out.println("usul 2 " + count);
        if (bool) return d;
        else return 0;
    }
}
