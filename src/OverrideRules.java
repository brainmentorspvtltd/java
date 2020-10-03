class X {

  int a, b;
  String e;
}

class Y extends X {

  int c, d;  // a,b,c,d,e
}

class Parent {

  protected X show() {
    X obj = new X();
    System.out.println("Parent Show...");
    return obj;
  }
}

class Child extends Parent {

  @Override
  public Y show() {
    Y obj = new Y();
    System.out.println("Child Show..");
    return obj;
  }
}

public class OverrideRules {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
