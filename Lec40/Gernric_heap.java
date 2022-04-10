package Lec40;

import java.util.ArrayList;

public class Gernric_heap<T extends Comparable<T>> {
	private ArrayList<T> list = new ArrayList<>();

	public void add(T item) {
		this.list.add(item);
		int ci = list.size() - 1;
		upheapify(ci);

	}

	private void upheapify(int ci) {

		int pi = (ci - 1) / 2;
		if (islarger(this.list.get(ci), this.list.get(pi)) > 0) {// ci>>pi
			swap(ci, pi);
			upheapify(pi);
		}

	}

	public T Remove() {
		T rv = this.list.get(0);
		swap(0, this.list.size() - 1);
		this.list.remove(list.size() - 1);
		downheapify(0);
		return rv;

	}

	public void downheapify(int pi) {

		int li = 2 * pi + 1;
		int ri = 2 * pi + 2;
		int mini = pi;

		if (li < list.size() && islarger(list.get(li), list.get(mini))>0) {
			mini = li;
		}
		if (ri < list.size() && islarger(list.get(ri), list.get(mini))>0) {
			mini = ri;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}

	}

	private void swap(int ci, int pi) {
		T cth = this.list.get(ci);
		T pth = this.list.get(pi);
		this.list.set(ci, pth);
		this.list.set(pi, cth);

	}

	public void display() {
		System.out.println(list);
	}

	public int islarger(T t1, T t2) {
		return t1.compareTo(t2);
	}
}
