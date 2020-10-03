@FunctionalInterface
    // SAM
interface Calculator {

  public int calculate(int a, int b);
  //public void print();
}

// 1st way to use Interface
class MyCalc implements Calculator {

  @Override
  public int calculate(int x, int y) {
    return x + y;
  }
}

public class InterfaceUseWays {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    MyCalc obj = new MyCalc();
    int result = obj.calculate(100, 200);
    System.out.println("Result is " + result);

    // 2nd Way Anonymous Class
//		Calculator c = new Calculator(){
//			@Override
//			public int calculate(int x, int y){
//				return x * y;
//			}
//		};
//		result = c.calculate(100, 200);
//		System.out.println("Anonymous Class Result is "+result);
//		
//		Calculator d =new Calculator(){
//			public int calculate(int a, int b){
//				return  a - b;
//			}
//		};
//		result = d.calculate(90, 20);
//		System.out.println("Result is "+result);

    // 3rd Way Lambda Way (Java 8)
    Calculator e = (a, b) -> a + b;
    System.out.println("Lambda " + e.calculate(100, 200));
    Calculator f = (a, b) -> {
      System.out.println("A is " + a + " and B is " + b);
      return a + b;
    };
    result = f.calculate(10000, 20000);
    System.out.println("LAMBDA Result " + result);


  }

}
