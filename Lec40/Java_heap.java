package Lec40;

import java.util.*;

public class Java_heap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PriorityQueue<Integer> pq = new PriorityQueue<>();// min heap
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());// max heap

		pq.add(1);
		pq.add(10);
		pq.add(16);
		pq.add(-1);
		pq.add(189);
		System.out.println(pq);

		Cars[] car = new Cars[5];

		car[0] = new Cars(200, 10, "White");
		car[1] = new Cars(1000, 20, "Black");
		car[2] = new Cars(345, 3, "Yellow");
		car[3] = new Cars(34, 89, "Grey");
		car[4] = new Cars(8907, 6, "Red");

		PriorityQueue<Cars> gp = new PriorityQueue<>(new Comparator<Cars>() {

			@Override
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return o1.speed - o2.speed;
			}
		});// min heap
		gp.add(car[1]);
		gp.add(car[2]);
		gp.add(car[3]);
		gp.add(car[4]);
		System.out.println(gp);

	}

}
