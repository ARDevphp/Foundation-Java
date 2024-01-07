public class Example1 {
    public static void main(String[] args) {
        forExam();
    }

    public static void forExam() {
        for (int i = 1; i <= 10; i++) {
            System.out.print("i = " + i);
            for (int j = 1; j <= i; j++) {
                System.out.print("j = \t" + j);
            }
            System.out.println();
        }
    }
}
