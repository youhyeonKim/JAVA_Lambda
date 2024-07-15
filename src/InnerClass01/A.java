package InnerClass01;

public class A {
  //중첩클래스의 종류
  // 1. 클래스 멤버로 생성되는 클래스: 인스턴스 멤버 클래스, 정적 멤버 클래스
  // 2. 메서드 내에 생성되는 클래스: 로컬클래스
  class B{
    int field = 10;
    static int field2 = 20;
    B(){
      System.out.println("B 생성자 실행");
    }
    void method1(){
      System.out.println("B-method1 실행");
    }
    static void methos2(){
      System.out.println("B-method2 실행");
    }
  }

 //B field = new B();
  A(){
    B b = new B();
  }

  void useB(){
    B b = new B();
    System.out.println(b.field);
    b.method1();

    System.out.println(B.field2);
    B.methos2();
  }

}
