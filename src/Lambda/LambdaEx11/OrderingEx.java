package Lambda.LambdaEx11;

public class OrderingEx {

  public static void main(String[] args) {
    Person3 person3 = new Person3();
    person3.ordering(String::compareTo);
    person3.ordering(String::compareToIgnoreCase);
  }
}
