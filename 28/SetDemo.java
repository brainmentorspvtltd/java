import java.util.HashSet;

public class SetDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    //TreeSet<String> hs = new TreeSet<>();
    //LinkedHashSet<String> hs = new LinkedHashSet<>();
    HashSet<String> hs = new HashSet<>();
    hs.add("amit");  // hashCode and equals to find out this object
    // is duplicate or not.
    hs.add("ram");
    hs.add("amit");
    hs.add("ram");
    hs.add("mike");
    hs.add("tim");
    hs.add("kim");
    hs.add("vim");
    hs.add("kim");
    hs.add("vim");
    System.out.println(hs);
  }

}
