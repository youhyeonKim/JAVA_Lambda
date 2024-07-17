package Lambda;

import java.util.Arrays;
import java.util.List;


public class LambdaEx03 {
  @FunctionalInterface
  interface FindMax{
    int getMax(List<Integer> numbers);
  }
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4 ,5 ,6, 7, 8, 9, 10);
    FindMax findMax = numlist->{
      int max = Integer.MIN_VALUE;
      for(int num:numlist){
        if(num>max)
          max = num;
      }
      return max;
    };
    findMax.getMax(numbers);
  }

}
