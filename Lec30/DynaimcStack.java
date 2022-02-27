package Lec30;

import Lec29.Stack;

public class DynaimcStack extends Stack {
	@Override
	public void push(int item) throws Exception {

		if (super.isfull()) {
			int[] newarray = new int[2 * arr.length];
			for (int i = 0; i < super.arr.length; i++) {
				newarray[i] = arr[i];

			}

			this.arr = newarray;

		}
		super.push(item);

	}

}
