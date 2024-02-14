import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(123);
		list.add("Xyz");
		list.add(12.3);
		list.add(123);
		list.add(1, "Abc");
		System.out.println(list);
	}
}
