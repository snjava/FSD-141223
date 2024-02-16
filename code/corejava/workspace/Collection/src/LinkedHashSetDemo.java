import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet(20, 0.90f);
		set.add(123);
		set.add("Abc");
		set.add(12.3);
		set.add('X');
		set.add(123);
		set.add(null);
		set.add("Abc");
		set.add("Xyz");
		System.out.println(set);
		set.remove("Abc");
		System.out.println(set);
		
	}
}
