package CollectionPrograms;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>(16, 0.75f, true);

//		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>(16, 0.75f, true);
		lhm.put("A", 12);
		lhm.put("B", 13);
		lhm.put("C",  14);
		lhm.put("D", 15);

		lhm.put("A", 19);

		lhm.put("C", 5);
		System.out.println(lhm.get("B"));
		System.out.println(lhm.toString());
		
	}
}
