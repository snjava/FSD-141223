import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(111); // 0
		list.add("Xyz"); // 1
		list.add(321); // 2
		list.add(145); // 3
		System.out.println(list);
		list.add(2, 555); // add value at specific index
		System.out.println(list);
		list.remove(2); // remove value at specific index
		System.out.println(list);
		System.out.println(list.get(2)); // get the value of specific index
		list.set(2, 999); // to update the value of specific index
		System.out.println(list);
	}
}
