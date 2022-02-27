package Lec30;

import Lec29.Queue;

public class DynaicQueue extends Queue {
	@Override
	public void Enqueue(int item) throws Exception {
		if (this.isfull()) {
			int[] newarray = new int[2 * arr.length];
			for (int i = 0; i < this.size; i++) {
				int idx = (front + i) % this.arr.length;
				newarray[i] = arr[idx];

			}
			this.arr=newarray;

		}
		super.Enqueue(item);

	}

}
