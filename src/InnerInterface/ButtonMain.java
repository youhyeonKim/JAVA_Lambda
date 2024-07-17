package InnerInterface;

public class ButtonMain {

  public static void main(String[] args) {
    Button btn = new Button();

    class OkListener implements Button.ClickListener{

      @Override
      public void onClick() {
        System.out.println("버튼이 클릭되었습니다.");
      }
    }

    class CancelListener implements Button.ClickListener{

      @Override
      public void onClick() {
        System.out.println("취소버튼이 클릭되었습니다.");
      }
    }
    btn.setClickListener(new OkListener());
    btn.click();
    btn.setClickListener(new CancelListener());
    btn.click();
  }
}
