public class Home4 {
    public static void main(String[] args) {
        A2.getInstance();
    }
}
class A2{
    private static A2 a;
    protected A2() {
        System.out.println("object olindi");
    }
    public static A2 getInstance(){
        a = new A2();
        return a;
    }
}
