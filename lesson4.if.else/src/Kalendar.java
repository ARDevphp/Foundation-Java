public class Kalendar {
    public static void main(String[] args) {
        monthBze("Yanvar ",31);
        monthBze("Fevral " ,28);
        monthBze("Mart " ,31);
        monthBze("Aprel " ,30);
        monthBze("May ", 31);
        monthBze("Iyun ", 30);
        monthBze("Iyul ", 31);
        monthBze("Avgust ", 31);
        monthBze("Sentabr ", 30);
        monthBze("Oktabr ", 31);
        monthBze("Nayabr ", 30);
        monthBze("Dekabr ", 31);
    }
    public static void monthBze(String name, int day) {
        System.out.println(name);
        for (int i = 1; i <= 28; i++) {
            System.out.println(i);
        }

        if (day <= 30) {
            System.out.println(29);
            System.out.println(30);
        }
        if (day == 31) {
            System.out.println(29);
            System.out.println(30);
            System.out.println(31);
        }
    }
}
