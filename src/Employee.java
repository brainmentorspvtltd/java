// SRP
public class Employee {
	private int id;  // Instance Variable
	private String name;
	private double salary;
	private String companyName;
	private String city;
	private String state;
	private String country;
	private String phoneNumber;
	private String pincode;
	private double tax;
	
	

	
//	public Employee(int id , String name, double salary, String city
//			, String state, String country, String phoneNumber, 
//			String pincode, double tax){
//		
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	// Default Constructor
	public  Employee(){
		companyName = "TCS";
		//System.out.println("Employee Default Constructor is called...");
	}
	// Constructor overloading
	// Param Constructor
	public Employee(int id , String name, double salary){
		this(id, name);
		//this(); // Calling Default Constructor  (Must be the first line)
//		this.id =id;
//		this.name = name;
		this.salary = salary;
	}
	
	public Employee(int id , String name){
		this();
		this.id = id;
		this.name = name;
	}
	
	// SRP - Single Responsiblity Principle
	public void print(){
		System.out.println("Id "+this.id);
		System.out.println("Name "+this.name);
		System.out.println("Salary "+salary);
		System.out.println("Company Name "+companyName);
	}
	// Local Variable
	public void takeInput(int id , String name , double salary){
		if(id>0 && salary>0){
		this.id = id;  // Instance Var (LS) = Local Variable (RS)
		this.name = name;
		this.salary = salary;
		}
		else{
			System.out.println("Invalid Id or Salary");
		}
		
	}
	
}
