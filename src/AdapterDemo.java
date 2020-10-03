import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

interface Z {

  void show();

  void display();

  void print();
}

abstract class ZAdapter implements Z {

  @Override
  public void show() {
  }

  @Override
  public void display() {
  }

  @Override
  public void print() {
  }

}

class Y1 extends ZAdapter {

  @Override
  public void show() {
    System.out.println("Y1 Show....");
  }
}

public class AdapterDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    WindowListener w;
    WindowAdapter ww;
    Y1 obj = new Y1();
    obj.show();
  }

}
