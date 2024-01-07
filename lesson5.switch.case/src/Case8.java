public class Case8 {
    public static void main(String[] args) {
        month(29,2);
        month(29,3);
        month(21,9);
        month(29,12);
        month(28,13);
        month(3,2);
        month(31,2);
    }
    public static void month(int day, int month) {
        if (!(day > 1 && day < 31)) {
            System.out.println("Bunday kun yo'q");
        }
        if (!(month >= 1 && month <= 12)) {
            System.out.println("Bunday oy yo'q");
        }
        else {
            switch (month) {
                case 1 -> System.out.println(day + " Yanvar");
                case 2 -> {
                    if (day <= 28) {
                        System.out.println(day + " Fevral");
                    }
                }
                case 3 -> System.out.println(day + " Mart");
                case 5 -> System.out.println(day + " May");
                case 7 -> System.out.println(day + " Iyul");
                case 8 -> System.out.println(day + " Avgut");
                case 10-> System.out.println(day + " Oktaber");
                case 12 -> System.out.println(day + " Dekabr");
                case 4, 6, 9, 11 -> {
                    if (day <= 30) System.out.println(day+" Aprel");
                    else if (month == 6) System.out.println(day + " Iyun");
                    else if (month == 9) System.out.println(day + " Sentabr");
                    else if (month == 11) System.out.println(day + " Nayabr");
                }
            }
        }
    }
}
