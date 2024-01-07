public class Main {
    public static void main(String[] args) {
       B b = new B();
       b.setValue(5);
    }
}
abstract class A {
    private int son;

    abstract public int setValue(int son);
}
class B extends A{
    @Override
    public int setValue(int son) {
        return son;
    }
}