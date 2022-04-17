package Lec41;

import java.util.PriorityQueue;

public class Minimum_Sum_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2,2,3,3,4};
		System.out.println(Minimum_Sum(arr));

	}
	public static int Minimum_Sum(int [] arr) {
		
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		
		for (int i = 0; i < arr.length; i++) {
			heap.add(arr[i]);
			
		}
		
		int pair=0;
		while(heap.size()>1) {
			int a = heap.poll();
			int b = heap.poll();
			int c=a+b;
			pair+=c;
			heap.add(c);
			
		}
		return pair;
		
		
	}

}
