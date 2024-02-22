import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(111, "Abc");
		map.put(11, "Xyz");
		map.put(15, 'A');
		map.put(21, "Pqr");
		map.put(13, null);
		map.put(10, 34.54);
		map.put(1, 1234);
		map.put(111, "Demo");
		map.put(53, "Stu");
		System.out.println(map);
		
		System.out.println(map.firstKey()); // 1
		System.out.println(map.firstEntry()); // 1=1234
		
		System.out.println(map.lastKey()); // 111
		System.out.println(map.lastEntry()); // 111=Demo
		
		System.out.println(map.lowerKey(21)); // 15
		System.out.println(map.lowerEntry(21)); // 15=A
		
		System.out.println(map.higherKey(21)); // 53
		System.out.println(map.higherEntry(21)); // 53=Stu
		
		System.out.println(map.ceilingKey(21)); // 21
		System.out.println(map.ceilingEntry(21)); // 21=Pqr
		
		System.out.println(map.floorKey(21)); // 21
		System.out.println(map.floorEntry(21)); // 21=Pqr
		
		System.out.println(map.headMap(21)); // {1=1234, 10=34.54, 11=Xyz, 13=null, 15=A}
		System.out.println(map.tailMap(21)); // {21=Pqr, 53=Stu, 111=Demo}
	}
}
