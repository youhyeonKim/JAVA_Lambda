package InnerClass02;

public class A {
  int field = 10;
  String filed2 = "A instance filed2";
  void method(){
    System.out.println("A-method1");
  }
  static int filed3;
  static void method2(){
    System.out.println("A-static method2");

  }
  class B{
    String filed1 = "B instance filed1";
    void method_b(){
      System.out.println("Innerclass B에서 호출한 A-instance method");
      method();//A의 인스턴스 매소드
      System.out.println("Innerclass B에서 호출한 A-static instance method");
      method2();//A의 정적 메소드
      filed3 = 10;//A의 정적필드 --> InnerClass는 외부 클래스이 모든 자원을 활용할 수 있음
    }
    void print(){
      System.out.println("Innerclass B의 B instance 변수");
      System.out.println(filed1);
      System.out.println("Innerclass B에서 호출한 A-instance method");
      method();
      System.out.print("Innerclass B에서 호출한 A-변수 ");
      System.out.println(filed1+" "+filed2);

    }

    class C{
      void method_c(){
        System.out.println("Innerclass B의 정적 클래서 멤버 C");
      }
    }
  }
  void useB(){
    B b = new B();
    b.print();
  }

}
