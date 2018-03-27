import java.util.TreeSet;

public class SongsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet ts = new TreeSet(); // Non Generic TreeSet
		TreeSet<String> ts = new TreeSet<>(); // Generic TreeSet
		ts.add("It's My Life");
		ts.add("Hello");
		ts.add("Boom Boom");
		ts.add("Boom Boom");
		ts.add("Bang Bang");
		ts.add("It's My Life");
		System.out.println(ts);
		//ts.add(100);
		

	}

}
