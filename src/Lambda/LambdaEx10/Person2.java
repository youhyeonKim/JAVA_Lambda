package Lambda.LambdaEx10;

public class Person2 {
    public Member2 getMember1(CreateIdMember createIdMember){
      String id = "ssg-manager";
      Member2 member2 = createIdMember.create(id);
      return member2;
    }

    public Member2 getMember2(CreateIdNameNumber createIdNameNumber){
      String id = "ssg-manager";
      String name = "이어진";
      Member2 member2 = createIdNameNumber.create(id, name);
      return member2;
    }
}
