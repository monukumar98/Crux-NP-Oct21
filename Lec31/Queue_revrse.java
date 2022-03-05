package Lec31;

import Lec30.*;

public class Queue_revrse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynaicQueue dq = new DynaicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		dq.Display();
		Reverse(dq);
		System.out.println("............");
		dq.Display();

	}

	private static void Reverse(DynaicQueue dq) throws Exception {
		// TODO Auto-generated method stub
		if (dq.isEmpty()) {
			return;
		}
		int item = dq.Dequeue();
		Reverse(dq);
		dq.Enqueue(item);

	}

}
