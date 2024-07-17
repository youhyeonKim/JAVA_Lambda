package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaEx01 {
/*
    Q1. 1~10까지의 수를 담고 있는 리스트배열을 생성해보자
    Q2. 배열의 합을 구해보자
*/
  public static void main(String[] args) {
    //1-1. for문 이용
    List<Integer> list1 = new ArrayList<>();
    for(int i=1; i<=10; i++)
      list1.add(i);
    System.out.println(list1);

    //1-2. 메서드 이용
    List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println(list2);

    //2.
    int sum = list2.stream().mapToInt(i->i).sum();
    System.out.println(sum);
  }
}
