package Lec29;

public class Queue {
	private int[] arr;
	private int front;
	private int size;

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
		this.arr[size] = item;
		this.size++;

	}

	public int Dequeue() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Queue is empty h");
		}
		int item = this.arr[this.front];
		this.front++;
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

}
