import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(123);
		list.add("Xyz");
		list.add(12.3);
		list.add(123);
		list.add(1, "Abc");
		System.out.println(list); // [123, Abc, Xyz, 12.3, 123]
		list.addFirst(111);
		list.addLast(999);
		System.out.println(list); // [111, 123, Abc, Xyz, 12.3, 123, 999]
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		System.out.println(list); // [123, Abc, Xyz, 12.3, 123]
		
		list.push("Test"); // Is use to add object at the start.
		System.out.println(list); // [Test, 123, Abc, Xyz, 12.3, 123]
		System.out.println(list.pop()); // select and remove the first object, throws exception if list empty.
		System.out.println(list); // [123, Abc, Xyz, 12.3, 123]
		System.out.println(list.pollFirst()); // select and remove the first object return null if list empty
		System.out.println(list.pollLast()); // select and remove the last object return null if list empty
		System.out.println(list); // [Abc, Xyz, 12.3]
		System.out.println(list.peekFirst()); // Select the first element and not removes it 
		System.out.println(list.peekLast()); // Select the last element and not removes it
		System.out.println(list); // [Abc, Xyz, 12.3]
		
	}
}
