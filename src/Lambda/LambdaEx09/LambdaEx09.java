package Lambda.LambdaEx09;

import java.util.Arrays;
import java.util.List;

public class LambdaEx09 {

  public static void main(String[] args) {
    Person person = new Person();
    person.action(Integer::sum);
    person.action((x,y)->{
      return x*y;
    });

    Computer computer = new Computer();
    person.action(computer::multiply);
    person.action(Computer::adder);

    List<Integer> list = Arrays.asList(1, 2, 3, 4);
    System.out.println(list.stream().mapToInt(i->i).sum());
    list.forEach(System.out::println);
  }
}
