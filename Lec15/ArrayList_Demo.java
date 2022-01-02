package Lec15;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		System.out.println(list.size());
		arr[0] = 10;
		list.add(20);// last add
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		list.add(4, 60);// 0 to size
		System.out.println(list);
		list.add(1, 90);// 0 to size
		System.out.println(list);

		// Get
		// System.out.println(arr[0]);

		System.out.println(list.get(2));

		// remove

		System.out.println(list.remove(3));
		System.out.println(list);
		// System.out.println(list.size());

		arr[1] = 20;
		arr[1] = 30;
		list.set(1, 100);// update
		System.out.println(list);

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//
//		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");

		}
		System.out.println();
		Collections.sort(list);//sort 
		for (int val : list) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

}
