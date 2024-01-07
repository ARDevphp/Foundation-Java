class Main {
    public static void main(String[] args) {
        A a = new A();
        A.B b = new A.B();
        A.B.C c = b.new C();

        A.C c2 = a.new C();
        A.C.B b2 = c2.new B();
        A.C.B.F f = b2.new F();
    }
}

public class A {
    public static class B{
        class C {
        }
    }
   class C {
       class B {
            class F {

            }
        }
    }
}
