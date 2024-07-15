package Basic.LambdaEx05;

public class LambdaEx05 {

  public static void main(String[] args) {
    action((x, y)-> System.out.println(x+y));

    Calculable calculable = (x, y)-> {
      System.out.println(x+y);
    };
    calculable.calculate(10, 20);
  }
  public static void action(Calculable calculable){
    int a = 10;
    int b = 10;
    calculable.calculate(10, 10);
  }

}
