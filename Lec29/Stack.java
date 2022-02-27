package Lec29;

public class Stack {

	protected int[] arr;
	private int tos = -1;

	public Stack() {
		arr = new int[5];
	}

	public Stack(int cap) {
		arr = new int[cap];

	}

	public boolean ISempty() {
		return tos == -1;
	}

	public void push(int item) throws Exception {
		if (isfull() == true) {
			throw new Exception("pgl hai ho  jb tumhe pata stack full hai , element push kyu kr  raha hai ");
		}
		this.tos = this.tos + 1;
		this.arr[this.tos] = item;
	}

	public boolean isfull() {

		return this.tos == this.arr.length - 1;
	}

	public int pop() throws Exception {
		if (ISempty()) {
			throw new Exception("Stack Empty hai bhai kya kr raha hai");
		}
		int item = arr[tos];
		this.tos--;
		return item;
	}

	public int top() throws Exception {
		if (ISempty()) {
			throw new Exception("Stack Empty hai bhai kya kr raha hai");
		}
		int item = arr[tos];

		return item;
	}

	public int size() {
		return this.tos + 1;
	}

	public void Display() {
		for (int i = 0; i <= tos; i++) {
			System.out.print(this.arr[i] + " ");

		}
		System.out.println();
	}

}
