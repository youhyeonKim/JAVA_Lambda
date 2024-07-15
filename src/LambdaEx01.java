import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaEx01 {
  //1. ArrayList 내 원소 대입
  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>();
    for(int i=1; i<=10; i++)
      list1.add(i);
    //2. 메서드를 이용한 원소 대입 및 람다식을 이용한 짝수합 구하기
    List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int result = list2.stream().filter(number->number%2==0).mapToInt(Integer::intValue).sum();
  }

}
