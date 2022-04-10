package Lec40;

import java.util.ArrayList;

public class Heap {
	private ArrayList<Integer> list = new ArrayList<>();

	public void add(int item) {
		this.list.add(item);
		int ci = list.size() - 1;
		upheapify(ci);

	}

	private void upheapify(int ci) {

		int pi = (ci - 1) / 2;
		if (this.list.get(pi) > this.list.get(ci)) {
			swap(ci, pi);
			upheapify(pi);
		}

	}

	public int Remove() {
		int rv = this.list.get(0);
		swap(0, this.list.size() - 1);
		this.list.remove(list.size() - 1);
		downheapify(0);
		return rv;

	}

	public void downheapify(int pi) {

		int li = 2 * pi + 1;
		int ri = 2 * pi + 2;
		int mini = pi;

		if (li < list.size() && list.get(li) < list.get(mini)) {
			mini = li;
		}
		if (ri < list.size() && list.get(ri) < list.get(mini)) {
			mini = ri;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}

	}

	private void swap(int ci, int pi) {
		int cth = this.list.get(ci);
		int pth = this.list.get(pi);
		this.list.set(ci, pth);
		this.list.set(pi, cth);

	}

	public void display() {
		System.out.println(list);
	}
}
