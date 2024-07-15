package InnerClass01;

import InnerClass01.A.B;

public class A_main {

  public static void main(String[] args) {
    A a = new A();
    A.B b = a.new B();
    a.useB();
  }
}
