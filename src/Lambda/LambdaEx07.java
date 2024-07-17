package Lambda;

public class LambdaEx07 {
  @FunctionalInterface
  interface Function{
    double apply(double x, double y);
  }

  public static double cal(Function function){
    double x = 30;
    double y = 20;
    return function.apply(x, y);
  }
  public static void main(String[] args) {
    System.out.println(cal((x,y)->(x/y)));
  }

}
