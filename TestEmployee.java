
public class TestEmployee {

  public static void main(String[] args) {
    // this is the changes done by amit

    // DRY - Dont Repeat YourSelf
    int x = 100; // x is a variable of int type
    Employee ram;  // ram is a variable of Employee type
    ram = new Employee(1001, "Ram", 9999);
    ram.setSalary(ram.getSalary() + 10000);
    ram.setCity("Delhi");
    //ram.salary ++;
    //ram = new Employee();
    //ram.id = -1001;
    //ram.salary = -9999;
    //ram.takeInput(-1001, "Ram", -9090);
    ram.print(); // 99.print()
    System.out.println("Ram City is " + ram.getCity());
    // new is a keyword in JDK
    // new will create a memory dynamically
    // new Employee() - Will create a new object and initalize
    // the member variables with there default values.
    // and the reference of an object is get assign to the ram variable
//		System.out.println("Id "+ram.id);
//		System.out.println("Name "+ram.name);
//		System.out.println("Salary "+ram.salary);
    System.out.println("*****************************************");
    Employee shyam = new Employee(1002, "Shyam", 8888);
    //shyam.takeInput(1002, "Shyam", 8888);
    shyam.print();  // 88.print()
//		System.out.println("Id "+shyam.id);
//		System.out.println("Name "+shyam.name);
//		System.out.println("Salary "+shyam.salary);
  }

}
