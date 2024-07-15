package Basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaEx04 {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("John", "Adam", "Eve", "Jane");
    //1. comparator 익명 객체 생성을 통한 정렬
    Collections.sort(names, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
      }
    });
    System.out.println(names);
    //2. comparator 람다식을 이용한 정렬
    Collections.sort(names, (a,b)->a.compareTo(b));
    System.out.println(names);
  }
}
