import java.util.ArrayList;

public class ArryaListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list.isEmpty()); // true
		list.add(new Integer(123));
		list.add("Abc");
		list.add(23.45);
		list.add('A');
		list.add(23.45);
		list.add(23.45);
		System.out.println(list); // [123, Abc, 23.45, A, 23.45, 23.45]
		System.out.println(list.isEmpty()); // false
		list.remove(23.45);
		System.out.println(list); // [123, Abc, A, 23.45, 23.45]
		System.out.println(list.contains(123));
		System.out.println(list.size()); // 5
		//list.clear();
		//System.out.println(list);
		
		ArrayList l2 = new ArrayList();
		l2.add("Xyz");
		l2.add("Lmn");
		l2.add("Pqr");
		l2.add("Stu");
		
		list.addAll(l2);
		System.out.println(list);
		System.out.println(list.containsAll(l2));
		//list.retainAll(l2);
		list.removeAll(l2);
		System.out.println(list);
		
	}
}
