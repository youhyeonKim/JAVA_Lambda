package Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx15 {

  public static void main(String[] args) {
    Supplier<String> supplier = ()->"Hello World";
    supplier.get();

    Consumer<String> consumer = (str)->System.out.println(str.split(" ")[0]);
    consumer.andThen(System.out::println).accept("Hello ssg.com");

    Function<String, Integer> function = String::length;
    System.out.println(function.apply("apple"));

    Predicate<String> predicate = str->str.equals("Hello!!");
    System.out.println(predicate.test("Hello"));
  }

}
