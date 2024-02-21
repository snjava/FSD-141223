import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(123, "Abc");
		map.put(1.23, "Xyz");
		map.put("Lmn", 23.32);
		map.put('X', "Xyz");
		map.put(123, 'A');
		map.put(null, false);
		map.put(13, null);
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey(13));
		System.out.println(map.containsValue(13));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.get(123));
		map.remove(123);
		map.remove(123, 'A');
		System.out.println(map);
		map.clear();
		System.out.println(map);
	}
}
