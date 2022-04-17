package Lec41;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection_of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 5, 7, 2, 4, 2, 4, 3, 1, 1, 9, 8, 6 };
		int[] arr2 = { 9, 2, 3, 7, 5, 2, 11, 13, 19 };

	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums1.length; i++) {
			if (map.containsKey(nums1[i])) {
				// int ii=map.get(nums1[i]);
				map.put(nums1[i], map.get(nums1[i]) + 1);
			} else {
				map.put(nums1[i], 1);
			}

		}
		ArrayList<Integer> ll = new ArrayList<>();
		for (int i = 0; i < nums2.length; i++) {
			if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
				ll.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i]) - 1);
			}

		}

		int [] arr = new int [ll.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=ll.get(i);
			
		}
		return arr;
	}

}
