import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new Double(66.45));
		set.add(78.54);
		set.add(55.64);
		set.add(88.76);
		set.add(61.32);
		System.out.println(set);
		
		System.out.println(set.first()); // 55.64
		System.out.println(set.last()); // 88.76
		
		System.out.println(set.lower(78.54)); // return the small value than provided
		System.out.println(set.higher(78.54)); // return the higher value than provided
		
		System.out.println(set.floor(78.54)); // return the equal or small value than provided
		System.out.println(set.ceiling(75.00)); // return the equal or higher value than provided
		
		System.out.println(set.tailSet(75.00)); // return group of all the value after provided value 
		System.out.println(set.headSet(75.00)); // return group of all the value before provided value 

	}
}
