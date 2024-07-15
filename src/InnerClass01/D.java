package InnerClass01;

public class D {
  //메서드 내 정의된 클래스
  void useD(){
    class E{
      int field1 = 10;
      static int field2 = 20;

      E(){
        System.out.println("E 생성자 실행");
      }
      void method1(){
        System.out.println("E-method1 실행");
      }

      static void method2(){
        System.out.println("E-method2 실행");
      }
    }
    E e = new E();
    System.out.println(e.field1);
    e.method1();

    System.out.println(E.field2);
    E.method2();
  }

}
