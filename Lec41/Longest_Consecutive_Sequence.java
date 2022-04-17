package Lec41;

import java.util.HashMap;

public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 11, 13, 4, 8, 7, 14, 3, 15, 1, 9, 12 };
		System.out.println(countlength(arr));

	}

	public static int countlength(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i] - 1)) {
				map.put(arr[i], false);
			} else {
				map.put(arr[i], true);
			}

			if (map.containsKey(arr[i] + 1)) {
				map.put(arr[i] + 1, false);
			}

		}
		//System.out.println(map);
		int ans=0;
		for(int key: map.keySet()) {
			if(map.get(key)) {
				int count=1;
				int k=key+1;
				while(map.containsKey(k)) {
					count++;
					k++;
				}
				ans = Math.max(ans, count);
			}
		}

		return ans;

	}

}
