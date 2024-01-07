import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetComparable_1 {
	public static void main(String[] args) throws Exception {
		SortedSet backing = new TreeSet();
		backing.add(new Integer(1));
		System.out.println(backing.toString());
		backing.add(new Integer(2));
		backing.add(new Integer(3));
		
		backing.addAll(new TreeSet(backing));

		// SortedSet cannot have element which is not comparable.
		backing.add(new Object());

	}

}
