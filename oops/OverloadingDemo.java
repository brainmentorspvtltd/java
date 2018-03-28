class OnlineShop{
	void search(String searchType, String searchValue) {
		if(searchType.equals("brand")) {
			
		}
		else
		if(searchType.equals("os")) {	
			
		}
	}
	void search(double price) {
		
	}
	void search(String brand) {
		
	}
	void search(double price, String brand) {
		
	}
	void search(String os, double price) {
		
	}
//	void search(String os, String brand) {
//		
//	}
}
public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineShop on = new OnlineShop();
		on.search(9000.00);
		on.search("Nokia");
		//on.search(1,2,3);
	}

}
