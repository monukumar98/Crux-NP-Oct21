package Lec31;

import Lec30.DynaimcStack;

public class Queue_Using_Stack {

	DynaimcStack Primary = new DynaimcStack();

	public void Enqueue(int item) throws Exception {

		DynaimcStack Helper = new DynaimcStack();
		while (!Primary.ISempty()) {
			Helper.push(Primary.pop());
		}
		Primary.push(item);
		while (!Helper.ISempty()) {
			Primary.push(Helper.pop());
		}

	}

	public int Dequeue() throws Exception {
		return Primary.pop();
	}

	public int Getfront() throws Exception {
		return Primary.top();
	}

	public static void main(String[] args) throws Exception {
		Queue_Using_Stack qs = new Queue_Using_Stack();
		qs.Enqueue(10);
		qs.Enqueue(20);
		qs.Enqueue(30);
		qs.Enqueue(40);
		qs.Enqueue(50);
		System.out.println(qs.Getfront());
		System.out.println(qs.Dequeue());
		System.out.println(qs.Getfront());
	}

}
