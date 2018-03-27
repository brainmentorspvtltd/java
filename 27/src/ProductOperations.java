import java.util.ArrayList;
import java.util.Collections;

public class ProductOperations {
	public static void main(String[] args) {
		Product p = new Product(12,"Redmi 5",11000,"Redmi");
		System.out.println("P is "+p.toString());
		ArrayList<Product> productList = new ArrayList<>();
		productList.add(new Product(10,"apple IphoneX",90000,"IPhone"));
		productList.add(new Product(11,"Samsung Galaxy",70000,"Samsung"));
		productList.add(new Product(12,"Redmi 5",11000,"Redmi"));
		productList.add(new Product(13,"nokia X",20000,"Nokia"));
		System.out.println(productList.contains(p)?"Found":"Not Found");
		System.out.println(productList);
		System.out.println(productList.toString());
		
		// How to Sort 
		//Collections.sort(productList);
		//Collections.sort(productList,new SortByPrice());
		//Collections.sort(productList,(one,two)->
		//((Double)one.getPrice()).compareTo(two.getPrice()));
		Collections.sort(productList,(one,two)->((Double)two.getPrice()).compareTo(one.getPrice()));
		//Collections.sort(productList,(one,two)->one.getName().compareToIgnoreCase(two.getName()));
		System.out.println("After Sort");
		System.out.println(productList);
		
		
	}
}
