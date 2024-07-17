package AnonymousClass;

public class AnimalEx01{

  public static void main(String[] args) {
    Animal dog = new Dog();
    System.out.println(dog.eat());
  }

}

class Animal{
  public String eat() {return "먹이를 먹다.";}
}

class Dog extends Animal{

  @Override
  public String eat() {
    return "강아지 냠냠";
  }
}
