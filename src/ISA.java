class Account{
	double balance;
	int accountNumber;
	void deposit(double amount){
		balance += amount;
		System.out.println("Amount Deposit "+amount);
		System.out.println("Total balance is "+balance);
	}
	void roi(){
		System.out.println("Account Class ROI 5%");
	}
}
class CurrentAccount extends Account{
	@Override
	void roi(){
		System.out.println("Current A/C ROI is 6% PAY");
	}
	void odLimit(){
		System.out.println("OD Limit in Current Account...");
	}
}
class SavingAccount extends Account{
	//  It is an Annotation
	@Override
	void roi(){
		System.out.println("Saving Account ROI 4% Rec From Bank");
	}
	
	@Override
	void deposit(double amount){
		if(amount>=50000){
			System.out.println("Show Your PAN Card Number");
			return ;
		}
		super.deposit(amount);
		
	}
	void service(){
		System.out.println("Collect Money From Home....");
	}
}

class AccountCaller{
	// Polymorphic Method
	// Upcasting
	void call(Account account){
		account.deposit(9090);
		account.roi();
		if(account instanceof SavingAccount){
			SavingAccount sa = (SavingAccount) account; // Downcasting
			sa.service();
		}
		else
		if(account instanceof CurrentAccount){
			((CurrentAccount)account).odLimit(); //Downcasting
		}
		//account.service();
	}
}

public class ISA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DRY - Don't Repeat YourSelf
		AccountCaller ac = new AccountCaller();
		ac.call(new SavingAccount());
		System.out.println("********************************");
		ac.call(new CurrentAccount());
		
		
		
//		Account sa = new SavingAccount();  // Upcasting
//		//SavingAccount sa = new SavingAccount();
//		sa.deposit(50000);
//		sa.roi();
//		//sa.service();
//		System.out.println("**************************************");
//		//CurrentAccount ca = new CurrentAccount();
//		Account ca = new CurrentAccount(); // Upcasting
//		ca.deposit(10000);
//		ca.roi();
		//ca.odLimit();

	}

}
