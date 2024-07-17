package Lambda.LambdaEx10;

public class MemberEx {

  public static void main(String[] args) {
    Person2 ps = new Person2();
    //ps.getMember1(Member2::new);
    ps.getMember1((id)->{
      Member2 m = new Member2(id);
      return m;
    });
  }

}
