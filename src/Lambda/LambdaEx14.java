package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LambdaEx14 {

  public static void main(String[] args) {
    //1. for반복문 람다식으로 변경
    IntStream.range(0, 10).forEach(System.out::println);

    //2. 배열의 합을 람다식으로 변경
    int[] arr = {1, 2, 3, 4, 6};
    int sum = Arrays.stream(arr).sum();
    System.out.println(sum);

    //3. 람다식 이용하여 List출력하기
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    list.forEach(System.out::println);

    //4. 홀수에 대한 제곱 합 구하기
    int odd_doubled_sum = IntStream.range(0, 11).filter(num->num%2==1).map(i->i*i).sum();

  }

}
