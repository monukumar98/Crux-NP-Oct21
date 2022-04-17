package Lec41;

import java.util.*;

public class Map_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add 
		map.put("Ram", 97);
		map.put("Puja", 69);
		map.put("Kunj", 78);
		map.put("Aman", 18);
		map.put("Anku", 18);
		map.put("Riya", 58);
		map.put("Nitin", 158);
		//System.out.println(map);
		//map.put("Puja", 169);
		System.out.println(map);
		
//		// get
//		System.out.println(map.get("Nitin"));
//		// containsKey
//		System.out.println(map.containsKey("Ram"));
//		
//		// remove
//		System.out.println(map.remove("Ram"));
//		
//		map.put(null, null);
//		System.out.println(map);
		
		TreeMap<String, Integer> map1 = new TreeMap<>();
		map1.put("Ram", 97);
		map1.put("Puja", 69);
		map1.put("Kunj", 78);
		map1.put("Aman", 18);
		map1.put("Anku", 18);
		map1.put("Riya", 58);
		map1.put("Nitin", 158);
		System.out.println(map1);
		System.out.println(map1.get("Ram"));
		LinkedHashMap<String, Integer> map2= new LinkedHashMap<>();
		map2.put("Ram", 97);
		map2.put("Puja", 69);
		map2.put("Kunj", 78);
		map2.put("Aman", 18);
		map2.put("Anku", 18);
		map2.put("Riya", 58);
		map2.put("Nitin", 158);
		System.out.println(map2);

	}

}
