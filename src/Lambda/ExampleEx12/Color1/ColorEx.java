package Lambda.ExampleEx12.Color1;

public class ColorEx {

  public static Color getColor(CreateColor createColor){
    int R = 100;
    int G = 100;
    int B = 100;
    Color color = createColor.create(R,G,B);
    return color;
  }

  public static void main(String[] args) {
    Color color1 = getColor(Color::new);
    System.out.println(color1.getR());
  }
}
