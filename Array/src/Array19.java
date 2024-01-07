public class Array19 {
    public static void main(String[] args) {
        int [] n = {2,3,4,5,6,7,2,8,4};
        System.out.println(anInt(n));
    }
    static int anInt(int [] array) {
        int oxIndex = array.length;
        int birIndex;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < oxIndex) {
                birIndex = i;
                if (birIndex < array[i]) {
                    return array[i];
                }
            }
        }
        return 0;
    }
}
