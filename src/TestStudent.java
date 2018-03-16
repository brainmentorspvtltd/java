import static java.lang.System.out;
// Utility Class
// private cons + static methods + final class
final class MathOpr{
	private MathOpr(){
		
	}
	public static void sin(){
		out.println("MathOprClass  Sin");
	}
	public static void cos(){
		out.println("MathOpr Class Cos");
	}
}

// From Java 8 Interface can also have static methods
// Utility Interface
interface MathOpera{
public static void sin(){
		out.println("MathOpera Interface Sin");
	}
	public static void cos(){
		out.println("MathOpera Interface Cos");
	}
}

class Student{
	int rollno; // Instance Variable , 
	// get loaded when  u create an object
	// It is per Instance Variables per Object
	static void applyForSc(){
		out.println("Apply For SC...");
	}
	static int counter; // I will load in memory
	// when u load a class
	// So I will load only once in Memory
	static{
		out.println(" I Will Call When Class Is Loaded..."+counter );
	}
	Student(){
		rollno++;
		counter++;
		out.println("I Will Call When ever u create an object "+rollno +" Counter is  "+counter);
	}
	
}
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MathOpr m = new MathOpr();
		//m.sin();
		//m.cos();
		MathOpera.sin();
		MathOpera.cos();
		MathOpr.sin();
		MathOpr.cos();
		Student.applyForSc();
		Student ram = new Student();
		Student shyam = new Student();
		Student mike = new Student();
		
		

	}

}
