import java.util.HashSet;
import java.util.TreeSet;

class Customer implements Comparable<Customer> {

  private int id;
  private String name;
  private double balance;

  @Override
  public int compareTo(Customer customerObject) {
    //return this.name.compareToIgnoreCase(customerObject.name);
    return customerObject.name.compareToIgnoreCase(this.name);
  }

  Customer(int id, String name, double balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "Id " + id + " Name " + name + " Balance " + balance + "\n";
  }

  // Bucket Number Generation
  @Override
  public int hashCode() {
    return name.length();
  }

  // Compare in Bucket the Object is Present or Not
  @Override
  public boolean equals(Object object) {
    if (object instanceof Customer) {
      Customer customer = (Customer) object;
      if (this.id == customer.id && this.name.equals(customer.name)
          && this.balance == customer.balance) {
        return true;
      }
    }
    return false;
  }
}

public class SetWithCustomObjects {

  public static void main(String[] args) {

    // TODO Auto-generated method stub

    TreeSet<Customer> customerTreeSet = new TreeSet<>();
    customerTreeSet.add(new Customer(1000, "Ram", 8888));
    customerTreeSet.add(new Customer(1000, "Ram", 8888));
    customerTreeSet.add(new Customer(1001, "Amit", 9999));
    customerTreeSet.add(new Customer(1001, "Amit", 9999));
    customerTreeSet.add(new Customer(1002, "Shyam", 18888));
    customerTreeSet.add(new Customer(1002, "Shyam", 18888));
    System.out.println(customerTreeSet);

    System.out.println("*****************************************");

    Customer amit = new Customer(1001, "Amit", 9000);
    HashSet<Customer> customerSet = new HashSet<>();
    customerSet.add(amit);
    customerSet.add(new Customer(1003, "Anil", 7777));
    customerSet.add(new Customer(1002, "Ram", 8888));
    customerSet.add(new Customer(1002, "Ram", 8888));
    customerSet.add(new Customer(1001, "Amit", 9000));

    for (Customer customer : customerSet) {
      System.out.println(customer.hashCode());
    }
    System.out.println(customerSet);

    //System.out.println(amit);  //amit.toString();

  }

}
