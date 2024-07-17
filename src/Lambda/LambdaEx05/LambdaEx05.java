package Lambda.LambdaEx05;

public class LambdaEx05 {

  public static void main(String[] args) {
    action((x,y)->{
      int sum = x+y;
      System.out.println(sum);
    });


  }

  public static void action(Calculabe calculabe){
    int x = 10;
    int y = 10;

    calculabe.calculate(x, y);
  }

}
