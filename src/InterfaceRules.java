interface K1 {

  void show();

  void print();

  int X = 100;  // static so bind with K1
}

interface K2 {

  void show();

  void add();

  int X = 200; // static so bind with K2
}

//interface K3 extends K1, K2{
//	
//}
class K4 implements K1, K2 {

  @Override
  public void show() {
    System.out.println("K4 Show..." + (K1.X + K2.X));
  }

  public void add() {

  }

  public void print() {

  }
}

public class InterfaceRules {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    K4 obj = new K4();
    obj.show();

  }

}
