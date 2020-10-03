import java.util.Scanner;

public class TakingInput {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    // Scanner is a Buffer
    // System is a class and it has an object called in
    // and in is a object of InputStream

    System.out.println("Enter the Name");
    //String name = scanner.next();  // read a word
    String name = scanner.nextLine();
    System.out.println("Name is " + name);
    System.out.println("Enter the Salary");
    double salary = scanner.nextDouble();
    System.out.println("Salary is " + salary);
    System.out.println("Enter the Age");
    int age = scanner.nextInt();
    System.out.println("Age is " + age);
    scanner.close();


  }

}
