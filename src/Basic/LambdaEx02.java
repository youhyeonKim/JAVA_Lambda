package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaEx02 {
  @FunctionalInterface
  interface MathOperation{
    int operate(int x, int y);
  }

  interface StringOperation{
    int operate(String s);
  }

  interface ArrayOperation{
    int operate(int[] numbers);
  }

  public static void main(String[] args) {
    MathOperation addition = (x, y)-> x+y;
    int result1 = addition.operate(10, 20);
    System.out.println(result1);

    StringOperation getLen = (s)->s.length();
    int result2 = getLen.operate("Java Programming");
    System.out.println(result2);

    //List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    ArrayOperation evensum = (numbers) -> {
      int sum = 0;
      for(int n:numbers){
        if(n%2==0)
          sum += n;
      }
      return sum;
    };
    int result3 = evensum.operate(list);
    System.out.println(result3);
  }
}
