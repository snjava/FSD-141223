import java.util.ArrayList;

/*
 * Generic Type 
 * 1. By Default all the collection allows different type of values, 
 * but it is not recommended to use collection for generic type.
 * 2. You can specify the generic type while using a collection, 
 * which force user to store that specific type of value
 * 3. Generic Type has to provide inside bracket '<>'
 * 4. generic type has to be a class name, either it can be build-in or custom class  
 */

public class GenericType {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(34.65);
		list.add(64.62);
		list.add(68.12);
		list.add(78.54);
		list.add(61.78);
		System.out.println(list);
		
	}
}
