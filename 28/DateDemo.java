import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Press 1 for English");
		System.out.println("हिंदी के लिए 2 दबाएं");
		Scanner scanner= new Scanner(System.in);
		int choice  = scanner.nextInt();
		Locale locale = null;
		if(choice == 1) {
			locale = new Locale("en","US");
		}
		else
		if(choice ==2) {	
			locale = new Locale("hi","IN");
		}
		else {
			System.out.println("Wrong Choice ...");
			return;
		}
		
		ResourceBundle rb = ResourceBundle.getBundle("messages",locale);
		Date date = new Date();
		//System.out.println(date);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		System.out.println(c.getTime());
		c.roll(Calendar.MONTH, 12);
		//c.add(Calendar.MONTH, 12);
		System.out.println(rb.getString("msg1")+c.getTime());
		c.add(Calendar.YEAR, 10);
		System.out.println(rb.getString("msg2")+c.getTime());
		
		double amount = 990112.90;
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		String formattedAmount = nf.format(amount);
		System.out.println(rb.getString("amount")+formattedAmount);
		
		System.out.println(rb.getString("amount")+amount);
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locale);
		String formattedDate = df.format(c.getTime());
		System.out.println(formattedDate);
		
		

	}

}
