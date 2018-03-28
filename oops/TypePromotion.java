	
public class TypePromotion {
	void show(int ...x) {
		System.out.println("Var Args");
		int sum = 0;
		for(int i : x) {
			sum+=i;
		}
		System.out.println("Sum of All is "+sum);
	}
	void show(byte x) {
		System.out.println("byte");
	}
	void show(short x) {
		System.out.println("short");
	}
//	void show(Integer x) {
//		System.out.println("Integer");
//	}
	void show(Long x) {
		System.out.println("Long");
	}
//	void show(long x) {
//		System.out.println("long");
//	}
//	void show(int x) {
//		System.out.println("int ");
//	}
//	void show(double x) {
//		System.out.println("double");
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypePromotion tp = new TypePromotion();
		tp.show(1,2,3,4,5);
	}

}
