package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LambdaEx13 {

  public static void main(String[] args) {
    //1. IntStream 원소 출력하기
    IntStream.range(0, 10).forEach(System.out::println);
    //2. List원소 출력하기
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    list.forEach(System.out::println);

  }

}
