interface H {

  void show();  // public abstract void show();

  default void print() {
    System.out.println("I am H Print...");
  }
}

interface P {

  void show();  // public abstract void show();

  default void print() {
    System.out.println("I am P Print...");
  }
}

interface N extends H, P {

  @Override
  public default void print() {
    H.super.print();
    P.super.print();
    System.out.println(" I am N Print....");
  }
}

class V implements N {

  public void show() {
    System.out.println("V Show...");
  }

}

public class ProblemInDefaultJava8 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    V v = new V();
    v.print();
    v.show();
  }

}
