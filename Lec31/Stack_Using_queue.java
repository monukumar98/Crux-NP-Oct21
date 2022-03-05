package Lec31;

import Lec30.DynaicQueue;

public class Stack_Using_queue {
	DynaicQueue Primary = new DynaicQueue();

	public void push(int item) throws Exception {
		Primary.Enqueue(item);
	}

	public int pop() throws Exception {
		DynaicQueue helper = new DynaicQueue();
		while (Primary.size() > 1) {
			int item = Primary.Dequeue();
			helper.Enqueue(item);
		}
		int rv = Primary.Dequeue();

		while (!helper.isEmpty()) {
			int item = helper.Dequeue();
			Primary.Enqueue(item);
		}
		return rv;

	}

	public int peek() throws Exception {
		DynaicQueue helper = new DynaicQueue();
		while (Primary.size() > 1) {
			int item = Primary.Dequeue();
			helper.Enqueue(item);
		}
		int rv = Primary.Dequeue();

		while (!helper.isEmpty()) {
			int item = helper.Dequeue();
			Primary.Enqueue(item);
		}
		Primary.Enqueue(rv);
		return rv;

	}

	public int size() {
		return Primary.size();
	}
	public static void main(String[] args) throws Exception {
		Stack_Using_queue sq = new Stack_Using_queue();
		sq.push(10);
		sq.push(20);
		sq.push(30);
		sq.push(40);
		System.out.println(sq.peek());
		System.out.println(sq.pop());
		System.out.println(sq.peek());

		
		
	}

	
}
