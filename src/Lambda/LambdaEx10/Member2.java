package Lambda.LambdaEx10;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member2 {
  private String id;
  private String name;

  Member2(String id){
    this.id = id;
  }
}
