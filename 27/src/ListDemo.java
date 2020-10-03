import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // CRUD
    // Create, Read, Update, Delete
    //Vector<String> list = new Vector<>();
    ArrayList<String> list = new ArrayList<>();
    //LinkedList<String> list = new LinkedList<>();
    list.add("amit"); //Add
    list.add("amit");
    list.add("ram");
    list.add("shyam");
    list.add(0, "mike");
    //list.remove(0); // Delete
    list.remove("shyam");
    ArrayList<String> temp = new ArrayList<>();
    temp.add("tim");
    temp.add("kim");
    list.addAll(temp);
    System.out.println("After Add " + list);
    // Search
    System.out.println(list.contains("mike") ? "Found" : "Not Found");
    System.out.println(list.indexOf("mike") >= 0
        ? "Element Present" : "Not Present");
    list.set(0, "sachin"); // Update
    // Traverse
    // 1st way
    System.out.println("Simple For Loop");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    // 2nd Way
    System.out.println("****************** Itr Example ************");
    Iterator<String> itr = list.iterator();
    while (itr.hasNext()) {
      //itr.remove();
      String currentElement = itr.next();

      // Give the currentElement from a list and move to next element
      System.out.println(currentElement);
    }
    // 3rd way
    System.out.println("************* List itr Example ***************");
    ListIterator<String> listitr = list.listIterator();
    while (listitr.hasNext()) {
      String currentElement = listitr.next();
      System.out.println("List Next " + currentElement);
    }

    while (listitr.hasPrevious()) {
      String currentElement = listitr.previous();
      System.out.println("List Prev " + currentElement);
    }

    System.out.println("************ Enhance For Loop ***********");
    // 4th Way
    for (String currentElement : list) {
      System.out.println(currentElement);
    }

    // 5th Way
    System.out.println("*******ForEach Function *********************");
    list.forEach(currentElement -> System.out.println(currentElement));

    //Collections.sort(list);

    System.out.println(list);  // list.toString()
    System.out.println(list.toString());


  }

}
