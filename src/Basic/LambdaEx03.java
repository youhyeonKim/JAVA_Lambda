package Basic;

import java.util.Arrays;
import java.util.List;

public class LambdaEx03 {
  @FunctionalInterface
  interface FindMax{
    int getMax(List<Integer> numbers);
  }

  public static void main(String[] args) {
    FindMax findMax = numbers -> {
      int max_num = Integer.MIN_VALUE;
      for(Integer n:numbers){
        if(n>max_num)
          max_num = n;
      }
      return  max_num;
    };

    List<Integer> list = Arrays.asList(30, 20 ,34, 90, 45, 12, 67);
    int max_num = findMax.getMax(list);
    System.out.println(max_num);
  }

}
