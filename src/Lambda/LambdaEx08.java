package Lambda;
@FunctionalInterface
interface Operator{
  public int apply(int x, int y);
}
public class LambdaEx08 {

  public static int[] scores = {90, 80, 70};

  public static int maxOrMin(Operator operator){
    int result = scores[0];
    for(int i=0; i<scores.length; i++)
       result=operator.apply(result,scores[i]);
    return result;
  }
  public static void main(String[] args) {
    int max = maxOrMin(Math::max);
    int min = maxOrMin(Math::min);
    System.out.println(max);
    System.out.println(min);
  }

}
