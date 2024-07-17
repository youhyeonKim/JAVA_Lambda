package InnerClass02;

import InnerClass02.A.B;

public class AMain {

  public static void main(String[] args) {
    A a1 = new A();
    a1.useB();


    A a2 = new A();
    A.B b = a2. new B();
    A.B.C c = b. new C();
    c.method_c();
  }

}
