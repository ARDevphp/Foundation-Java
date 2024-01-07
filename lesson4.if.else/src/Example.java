import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("O'yin o'ynashni xohlaysizmi ");
        System.out.println("Bilimdon o'ynini o'ynash uchun 1 bosing");
        System.out.println("ortgs 2 bosing");
        int game = scanner.nextInt();
        int count = 0;

        if (game != 1) {
            System.out.println("Siz o'yinda chiqdingiz");
        } else {
            System.out.println("O'yinni boshladik");
            System.out.print("2x5=");
            int tab = scanner.nextInt();
            if (tab == 10) count++;
            System.out.print("5x7=");
            tab = scanner.nextInt();
            if (tab == 35) { count++; }
            System.out.print("4x9=");
            tab = scanner.nextInt();
            if (tab == 35) count++;
            System.out.print("7x8=");
            tab = scanner.nextInt();
            if (tab == 56) count++;
            System.out.print("8x6=");
            tab = scanner.nextInt();
            if (tab == 48) count++;
            if (count == 1) System.out.println("siz 5 ta savoldan " + count + " tasiga javob berdingiz");
            else if (count == 2) System.out.println("siz 5 ta savoldan " + count + " tasiga javob berdingiz");
            else if (count == 3) System.out.println("siz 5 ta savoldan " + count + " tasiga javob berdingiz");
            else if (count == 4) System.out.println("siz 5 ta savoldan " + count + " tasiga javob berdingiz");
            else if (count == 5) System.out.println("siz 5 ta savoldan " + count + " tasiga javob berdingiz");
            else System.out.println("javobingiz barchasi nato'g'ri");
        }
    }
}
