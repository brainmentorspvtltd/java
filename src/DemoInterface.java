// What to DO things
interface IPlayer {   // abstract interface IPlayer

  int MIN_SPEED = 1; // public static final int MIN_SPEED  = 1;
  public static final int MAX_POWER = 100;

  void run();  // public abstract void run();

  public abstract void jump();

  void walk();

  void attack();

}

class GreenPlayer implements IPlayer {

  @Override
  public void run() {
    System.out.println("Green Player Run Lazy");
    // TODO Auto-generated method stub

  }

  @Override
  public void jump() {
    System.out.println("Green Player Jump High");
    // TODO Auto-generated method stub

  }

  @Override
  public void walk() {
    // TODO Auto-generated method stub

  }

  @Override
  public void attack() {
    // TODO Auto-generated method stub

  }

}

// How to Do 
class RedPlayer implements IPlayer {

  public void takePower() {

  }

  @Override
  public void run() {
    System.out.println("RedPlayer Run Fast ....");
  }

  @Override
  public void jump() {
    System.out.println("Red Player Jump Low");
  }

  @Override
  public void walk() {
    System.out.println("Red Player Walk ");
  }

  @Override
  public void attack() {
    System.out.println("Red Player Attack " + MAX_POWER);
  }
}

public class DemoInterface {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    IPlayer rp = new RedPlayer(); //Upcasting
    rp.attack();
    rp.run();

    ((RedPlayer) rp).takePower();

  }

}
