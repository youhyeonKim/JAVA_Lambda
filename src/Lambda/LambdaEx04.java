package Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaEx04 {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("John", "Adam", "Eve", "Jane");
    Collections.sort(names, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if(o1.compareTo(o2)<0)
          return 1;
        else if(o1.compareTo(o2) == 0)
          return 0;
        else
          return -1;
      }
    });
    System.out.println(names);
    Collections.sort(names, (a,b)->a.compareTo(b));
    names.sort(String::compareTo);;
    System.out.println(names);
  }

}
