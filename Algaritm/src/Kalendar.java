public class Kalendar {
    public static void main(String[] args) {
        monthLong("Yanvar ");
        System.out.println();
        monthBase("Fevral ");
        System.out.println();
        monthLong("Mart   ");
        System.out.println();
        monthShort("Aprel ");
        System.out.println();
        monthLong("May    ");
        System.out.println();
        monthShort("Iyun  ");
        System.out.println();
        monthLong("Iyul   ");
        System.out.println();
        monthLong("Avgust  ");
        System.out.println();
        monthShort("Sentabr ");
        System.out.println();
        monthLong("Oktabr ");
        System.out.println();
        monthBase("Nayabr ");
        System.out.println();
        monthLong("Dekabr ");
    }
    public static void monthBase(String name){
        System.out.print(name + " ");
        for (int i = 1; i <= 28; i++) {
            System.out.print(i+"\t");
        }
    }
    public static void monthShort(String name) {
        System.out.print(name + " ");
        for (int i = 1; i <= 30; i++) {
            System.out.print(i+"\t");
        }
    }
    public static void monthLong(String name) {
        System.out.print(name + " ");
        for (int i = 1; i <= 31; i++) {
            System.out.print(i+"\t");
        }
    }
}
