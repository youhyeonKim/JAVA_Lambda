package InnerClass01;

public class F {
  public void method1(int n){
    int var = 1;
    class G{
      void method2(){
        System.out.println("n값: "+ n);
        System.out.println("var값: "+ var);
        //var = 2 <- 로컬클래스 내부에서는 로컬변수 수정 불가
      }
    }
    G g = new G();
    g.method2();

  }
}
