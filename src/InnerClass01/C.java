package InnerClass01;

public class C {
  //로컬 클래스: 생성자 내 생성된 클래스, 메서드 내 생성된 멤버클래스
  //-> 메서드가 실행되어야만 해당 객체를 사용할 수 있음
  C(){
    class D{}
    D d = new D();
  }

  void method(){
    class D{}
    D d = new D();
  }
}
