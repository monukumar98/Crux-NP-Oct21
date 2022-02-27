package Lec29;

public class Queue {
	protected int[] arr;
	protected int front;
	protected int size;

	public Queue() {
		arr = new int[5];
		this.front = 0;
		this.size = 0;
	}

	public Queue(int cap) {
		arr = new int[cap];
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public boolean isfull() {
		return this.size == arr.length;
	}

	public void Enqueue(int item) throws Exception {
		if (this.isfull()) {
			throw new Exception("Queue is full");
		}
		int i = (this.size + this.front) % this.arr.length;
		this.arr[i] = item;
		this.size++;

	}

	public int Dequeue() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Queue is empty h");
		}
		int item = this.arr[this.front];
		this.front = (this.front + 1) % this.arr.length;
		this.size--;
		return item;
	}

	public int size() {
		return this.size;
	}

	public int GetFront() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Queue is empty h");
		}
		return this.arr[this.front];
	}

	public void Display() {
		for (int i = 0; i < this.size; i++) {
			int idx = (front + i) % this.arr.length;
			System.out.print(arr[idx] + " ");

		}
		System.out.println();
	}

}
