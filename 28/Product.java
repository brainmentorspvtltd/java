
public class Product implements Comparable<Product> {
	private int id;
	private String name;
	private double price;
	private String desc;
	
	@Override
	public int compareTo(Product product) {
		//return this.name.compareTo(product.name);
		//return product.name.compareTo(this.name);
		return this.name.compareToIgnoreCase(product.name);
	}
	
	@Override
	public boolean equals(Object object) {
		boolean isSame = false;
		if(object instanceof Product) {
			Product product = (Product) object; // Downcasting
			if(this.id ==product.id && this.name.equals(product.name)
					&& this.price == product.price && this.desc.equals(product.desc)) {
				isSame = true;
			}
		}
		return isSame;
		
	}
	
	@Override
	public String toString() {
		return "Id "+id+" Name "+name+" Price "+price+" Desc "+desc+"\n";
	}
	
	public Product(int id , String name , double price, String desc) {
		this.id =id;
		this.name = name;
		this.price = price;
		this.desc = desc;
				
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

}
