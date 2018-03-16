import java.util.ArrayList;

class Customer{
	private long id;
	private String name;
	private double balance;
	Customer(long id , String name, double balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
}
public class MemoryManagement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		long counter = 1;
		ArrayList customerList = new ArrayList();
		System.out.println("Main Start....");
		while(true){
			Customer customer = new Customer(counter,"Ram",9000+counter);
			customerList.add(customer);
			counter++;
			Thread.sleep(40);
		}

	}

}
