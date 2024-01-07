public class Integer12 {
    public static void main(String[] args) {
        int a = 123;
        int b = a/100;
        int c = a%100;
        int c1 = c/10;
        int d = c%10;
        a = d*10+c1;
        a = a*10+b;
        System.out.println(a);
    }
}
