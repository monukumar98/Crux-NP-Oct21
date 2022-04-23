package Lec42;

import java.util.ArrayList;

public class HashMap<K, V> {

	private class Node {

		K key;
		V value;
		Node next;

		public Node(K key, V value) {
			// TODO Auto-generated constructor stub
			this.key = key;
			this.value = value;
		}

	}

	int size = 0;

	private ArrayList<Node> bucketArray;

	public HashMap(int cap) {
		// TODO Auto-generated constructor stub
		this.bucketArray = new ArrayList<>();
		for (int i = 0; i < cap; i++) {
			bucketArray.add(null);

		}
	}

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);

	}

	public void put(K key, V value) {

		int bn = Hashfunction(key);
		Node temp = this.bucketArray.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}

		Node nn = new Node(key, value);
		temp = this.bucketArray.get(bn);
		nn.next = temp;
		this.size++;
		this.bucketArray.set(bn, nn);
		double thf = 2.0;
		double lf = (1.0 * this.size) / this.bucketArray.size();
		if (lf > thf) {

			reHashing();
		}

	}

	private void reHashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> nba = new ArrayList<>();
		for (int i = 1; i <= 2 * this.bucketArray.size(); i++) {
			nba.add(null);

		}
		ArrayList<Node> oba = this.bucketArray;
		this.bucketArray = nba;
		for (Node nn : oba) {
			while (nn != null) {
				put(nn.key, nn.value);
				nn = nn.next;
			}
		}

	}

	public V get(K key) {
		int bn = Hashfunction(key);
		Node temp = this.bucketArray.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return temp.value;
			}
			temp = temp.next;
		}
		return null;

	}

	public boolean containsKey(K key) {
		int bn = Hashfunction(key);
		Node temp = this.bucketArray.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return true;
			}
			temp = temp.next;
		}
		return false;

	}

	public V remove(K key) {
		int bn = Hashfunction(key);
		Node temp = this.bucketArray.get(bn);
		Node prev = null;
		while (temp != null) {
			if (temp.key.equals(key)) {
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		if (temp == null) {
			return null;
		}
		this.size--;
		if (prev == null) {

			this.bucketArray.set(bn, temp.next);
		} else {
			prev.next = temp.next;

		}
		temp.next = null;
		return temp.value;

	}

	public int Hashfunction(K key) {
		int hv = key.hashCode() % this.bucketArray.size();
		hv = (hv + this.bucketArray.size()) % this.bucketArray.size();

		return hv;
	}

	@Override
	public String toString() {
		String s = "{";
		for (Node nn : bucketArray) {
			while (nn != null) {
				s = s + nn.key + " = " + nn.value + " , ";
				nn= nn.next;
						
			}
		}

		return s + "}";

	}

}
