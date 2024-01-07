import java.util.Random;

public class ArrayRandom {
    public static void show(int[] array, int n) {
        Random random = new Random(n);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n);
            System.out.print(array[i] + "\t");
        }
    }
}
