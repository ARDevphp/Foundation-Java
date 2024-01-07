public class TestUtil {
    public static void assertEquals(Object result,Object expected) throws IllegalAccessException {
        if (!result.equals(expected)) {
            throw new IllegalAccessException("Kutilgan natija: " + expected + " Sizning natijangiz :" + result);
        }
    }
}
