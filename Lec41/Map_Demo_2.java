package Lec41;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Map_Demo_2 {

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
		// part -1
		Set<String> set = map.keySet();
		System.out.println(set);
		for(String K:set) {
			System.out.println(K+" "+map.get(K));
		}
		
		// part 2
		
		ArrayList<String> ll = new ArrayList<>(map.keySet());
		System.out.println(ll);
		for(String K:ll) {
			System.out.println(K+" "+map.get(K));
		}
		
	}

}
