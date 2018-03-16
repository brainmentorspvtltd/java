class A1{
	int show(){
		System.out.println("A Show No Args");
		return 0;
	}
//	void show(int x){
//		System.out.println("int ");
//	}
	double show(int x, int y){
		System.out.println("2 int");
		return 0.0;
	}
//	void show(long x){
//		System.out.println("long");
//	}
	void show(short x){
		System.out.println("short");
	}
	void show(byte x){
		System.out.println("byte");
	}
	void show(Long x){
		System.out.println("Long Wrapper...");
	}
//	void show(Integer x){
//		System.out.println("Wrapper Integer");
//	}
//	void show(int ...x){
//		System.out.println("Var Args int");
//	}
	
}
public class TypePromotionRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj = new A1();
		obj.show((byte)1);
		//obj.show();
		//obj.show(10,20);
	}

}
