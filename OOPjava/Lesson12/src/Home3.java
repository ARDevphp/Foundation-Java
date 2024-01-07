public class Home3 {
    public static void main(String[] args) {
        B0 b0 = new B0(20);
        B0 b1 = new B0(20);
        System.out.println(b0.equals(b1));
        System.out.println(b0.getAge()+" "+b1.getAge());

    }
}
abstract class A3{
    abstract int getAge();
}
class B0 extends A3 {
    private int age;

    public B0(int age) {
        this.age = age;
    }
    @Override
    int getAge() {
        return age;
    }
    @Override
    public boolean equals(Object object) {
        return object instanceof B0;
    }
}
