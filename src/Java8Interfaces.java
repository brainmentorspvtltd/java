interface Calc{
	int add(int x, int y); // public abstract int add(int x, int y);
	default int multiply(int a, int b){
		return a * b;
	}
}
class MathOperations implements Calc{
	@Override
	public int add(int x , int y){
		return x + y;
	}
}
public class Java8Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperations obj = new MathOperations();
		int result = obj.add(100, 200);
		System.out.println("Add Result "+result);
		result = obj.multiply(10, 20);
		System.out.println("Multiply Result "+result);
		

	}

}
