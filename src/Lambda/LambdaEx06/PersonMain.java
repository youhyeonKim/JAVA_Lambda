package Lambda.LambdaEx06;

public class PersonMain {

  public static void main(String[] args) {
    Person person = new Person();
    person.action(()->
        System.out.println("9시 출근"));
  }

}
