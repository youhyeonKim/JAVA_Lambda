package Lambda.LambdaEx09;


public class Person {
  public void action(Calculable calculable){
    int result = calculable.calculate(10, 30);
    System.out.println("결과값 = "+result);
  }

}
