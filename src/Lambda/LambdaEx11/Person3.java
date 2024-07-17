package Lambda.LambdaEx11;

public class Person3 {
  public void ordering(Comparable comparable){
    String name1 = "SSG";
    String name2 = "KSG";

    int result = comparable.compare(name1, name2);

    if (result < 0) {
      System.out.println(name1+"은 "+name2+"보다 앞섭니다.");
    }else if(result == 0){
      System.out.println(name1+"은 "+name2+"과 같습니다.");
    }else{
      System.out.println(name1+"은 "+name2+"보다 뒤에 섭니다.");
    }
  }

}
