import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class MapDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // Nested D.S
    TreeMap<String, List<Integer>> phoneMap = new TreeMap<>();
    //LinkedHashMap<String,List<Integer>> phoneMap = new LinkedHashMap<>();
    //HashMap<String,List<Integer>> phoneMap = new HashMap<>();
    List<Integer> l = Arrays.asList(2222, 4444, 6666);
    phoneMap.put("amit", l);
    phoneMap.put("ram", Arrays.asList(9999, 5555, 6666));
    phoneMap.put("tim", Arrays.asList(9999, 5555, 6666));
    phoneMap.put("tim", Arrays.asList(9999, 5555, 6666));
    phoneMap.put("kim", Arrays.asList(9999, 5555, 6666));
    phoneMap.put("vim", Arrays.asList(9999, 5555, 6666));
    phoneMap.put("vim", Arrays.asList(9999, 5555, 6666));
//		phoneMap.put("shyam", 4444);
//		phoneMap.put("amit", 9999);
    System.out.println(phoneMap);


  }

}
