import java.io.FileNotFoundException;
import java.io.IOException;

class A1{
	int x,y;
}
class B1 extends A1{
	int z;
}
class M{
	int t,p;
}
class Parent{
	protected A1 show() throws IOException{
		System.out.println("Parent Class Show ");
		A1 obj = new A1();
		obj.x = 100;
		obj.y = 200;
		return obj;
	}
	Number display() {
		return 1000;
	}
	Object output() {
		return 100;
	}
}
class Child extends Parent{
	String output() {
		return "";
	}
	@Override
	Integer display()
	{
		return 2000;
	}
	@Override
	 public B1 show() throws FileNotFoundException {
		B1 obj = new B1();
		obj.x = 10;
		obj.y = 20;
		obj.z = 90;
		System.out.println("Child Class Show");
		return obj;
	}
}
class P{
	static void print() {
		System.out.println("this is P Print");
	}
}
class P2 extends P{
	//@Override
	int x = 100;
	static void print() {
		//System.out.println("this is P2 Print..."+x);
	}
}

class Static{
	static class QQ{
		static void print() {
			System.out.println("print...");
		}
	}
	static int w;
	static void show() {
		System.out.println("Static show");
	}
	static {
		w = 1000;
		System.out.println(" i will init the static members");
	}
}

public class OverrideRules {

	//@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static.QQ.print();
		Static.show();
		System.out.println(Static.w);
		
		P obj = new P2();
		obj.print();

	}

}
