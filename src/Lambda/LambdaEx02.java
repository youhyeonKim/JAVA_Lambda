package Lambda;

public class LambdaEx02 {
  @FunctionalInterface
  interface MathOperation{
    int operate(int a, int b);
  }

  interface StringOperation{
    int operate(String s);
  }

  interface ArrayOpertaion{
    int operate(int[] numbers);
  }

  public static void main(String[] args) {
    MathOperation mathOperation = new MathOperation() {
      @Override
      public int operate(int a, int b) {
        return Math.max(a, b);
      }
    };
    mathOperation.operate(10 ,20);
    MathOperation mathOperation1 = (a,b)-> Math.max(a, b);
    mathOperation1.operate(10, 30);

    StringOperation stringOperation = s -> s.length();
    stringOperation.operate("Hello World!");

    ArrayOpertaion arrayOpertaion = numbers->{
      int sum = 0;
      for(int n:numbers){
        if(n%2==0)
          sum +=n;
      }
      return sum;
    };

  }
}
