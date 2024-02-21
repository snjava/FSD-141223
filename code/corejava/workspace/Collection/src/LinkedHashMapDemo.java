import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap map = new LinkedHashMap();
		map.put(123, "Abc");
		map.put(1.23, "Xyz");
		map.put("Lmn", 23.32);
		map.put('X', "Xyz");
		map.put(123, 'A');
		map.put(null, false);
		map.put(13, null);
		System.out.println(map);
	}

}
