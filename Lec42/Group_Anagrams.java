package Lec42;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(arr));

	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			int[] frq = new int[26];
			for (int j = 0; j < strs[i].length(); j++) {
				char ch = strs[i].charAt(j);
				frq[ch - 'a'] = frq[ch - 'a'] + 1;
			}
			StringBuilder sb = new StringBuilder();
			for (int k = 0; k < frq.length; k++) {
				if (frq[k] != 0) {
					sb.append(frq[k]+" ");
				} else {
					sb.append("*"+" ");
				}

			}
			String s = sb.toString();
			if (!map.containsKey(s)) {
				map.put(s, new ArrayList<>());
			}
			map.get(s).add(strs[i]);

		}

		List<List<String>> ll = new ArrayList<>();
		for (String key : map.keySet()) {
			ll.add(map.get(key));
		}
		return ll;
	}

}
