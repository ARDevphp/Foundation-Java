import java.util.Scanner;

public class Case7 {
    public static void main(String[] args) {
        solutin(1,500);
        solutin(2,43553);
        solutin(3,43553);
        solutin(4,43553);
        solutin(5,43553);
        solutin(6,4);
        solutin(0,43);
    }
    /**
     * 1-klogrmm = 1kg == 1kg
     * 2-miligramm = 1000 == 1gmm
     * 3-gramm = 1000gmm== 1kg
     * 4-tonna = 1000kg == 1tn
     * 5-sentner = 100kg == 1sentner
     * @param kg
     * @return
     */
    public static int solutin(int qiymat, int kg) {
        if (!(qiymat >= 1 && qiymat <= 5)) {
            System.out.println("Olchovbirligini qayta kriting | 1..5 | oraliqda");
        }else {
            switch (qiymat) {
                case 1 -> {
                    kg = kg*1;
                    System.out.println(kg+" ga teng");
                }
                case 2 -> {
                    kg = kg/100000;
                    System.out.println(kg + " ga teng");
                }
                case 3 -> {
                    kg = kg/1000;
                    System.out.println(kg + " ga teng");
                }
                case 4 -> {
                    kg = kg*1000;
                    System.out.println(kg + " ga teng");
                }
                case 5 -> {
                    kg = kg*100;
                    System.out.println(kg + " ga teng");
                }
            }
        }
        return kg;
    }
}
