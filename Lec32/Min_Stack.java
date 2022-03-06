package Lec32;

import java.util.Stack;

public class Min_Stack {
	private Stack<Integer> st = new Stack<>();
	private int min;

	public void push(int item) {

		if (this.st.isEmpty() || item > this.min) {
			if (this.st.isEmpty()) {
				this.min = item;
				st.push(item);
			} else {
				st.push(item);
			}
		} else {
			int val = 2 * item - this.min;
			st.push(val);
			this.min = item;

		}
	}

	public int pop() throws Exception {
		if (st.isEmpty()) {
			throw new Exception("Pgl h ??");
		}

		if (st.peek() < this.min) {
			int val = st.pop();
			int rv = this.min;
			this.min = 2 * this.min - val;
			return rv;

		}

		else {
			return st.pop();
		}
	}

	public int peek() throws Exception {
		if (st.isEmpty()) {
			throw new Exception("Pgl h ??");
		}

		if (st.peek() < this.min) {

			return this.min;

		}

		else {
			return st.peek();
		}
	}

	public int min() {
		return this.min;
	}

	public void Display() {
		System.out.println(this.st);
	}
}
