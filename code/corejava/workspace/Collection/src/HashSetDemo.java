import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet set = new HashSet(20, 0.90f);
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
