package AnonymousClass;

import InnerClass02.A;

class Animal1{
  public String eat(){return "먹이를 먹다";}
}
public class AnimalEx02 {

  public static void main(String[] args) {
    Animal1 dog = new Animal1(){
      @Override
      public String eat() {
        return "강아지 냠냠";
      }
    };
    dog.eat();

    class Dog extends Animal{
      @Override
      public String eat() {
        return "강아지 냠냠1";
      }
    }
    Animal dog1 = new Dog();
    dog1.eat();

  }
}


