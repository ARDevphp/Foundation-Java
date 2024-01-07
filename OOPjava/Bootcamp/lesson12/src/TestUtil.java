public class TestUtil {
    public static void assertEquals(Object result, Object expected) {
        if (!result.equals(expected)) {
            throw new IllegalArgumentException("Kutilgan natija: " + expected + " Sizning natijangiz:" + result);
        }
    }
}
