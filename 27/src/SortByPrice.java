import java.util.Comparator;

public class SortByPrice implements Comparator<Product> {

	@Override
	public int compare(Product one , Product two) {
		return ((Double)one.getPrice()).
				compareTo(two.getPrice());
	}
}
