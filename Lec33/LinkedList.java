package Lec33;

public class LinkedList {
	private class Node {
		int data;
		Node next;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}

	}

	private Node head;
	private int size;
	private Node tail;

	public void addfirst(int item) {

		Node nn = new Node(item);
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			nn.next = this.head;
			this.head = nn;
			this.size++;
		}

	}

	public void addlast(int item) {
		if (this.size == 0) {
			addfirst(item);
		} else {
			Node nn = new Node(item);
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}
	}

	public void Addatindex(int k, int item) throws Exception {
		if (k < 0) {
			throw new Exception("Index glt h");
		}

		if (k == 0) {
			addfirst(item);
		} else if (k == this.size) {
			addlast(item);
		} else {
			Node nn = new Node(item);
			Node prev = GetNode(k - 1);
			nn.next = prev.next;
			prev.next = nn;
			this.size++;

		}

	}

	private Node GetNode(int k) throws Exception {
		if (k < 0 || k >= this.size)
			throw new Exception("Index glt h");
		Node temp = this.head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public int getfirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is empty");
		}

		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is empty");
		}

		return this.tail.data;
	}

	public int getatindex(int k) throws Exception {
		return GetNode(k).data;
	}

	public int removefirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is empty");
		}

		if (this.size == 1) {
			int rd = this.head.data;
			this.head = null;
			this.tail = null;
			this.size--;
			return rd;
		} else {
			Node temp = this.head;
			this.head = this.head.next;
			temp.next = null;
			this.size--;
			return temp.data;
		}

	}

	public int removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is empty");
		}
		if (this.size == 1) {
			return removefirst();
		} else {
			Node last = GetNode(this.size - 2);
			int rd = last.next.data;
			last.next = null;
			this.tail = last;
			this.size--;
			return rd;
		}

	}

	public int removekthnode(int k) throws Exception {
		if(k<0 || k>=this.size) {
			throw new Exception("Index glt h");
		}
		if(k==0) {
			return removefirst();
		}
		else if(k==this.size-1) {
			return removeLast();
		}
		else {
			Node prev= GetNode(k-1);
			Node curr= prev.next;
			prev.next=curr.next;
			curr.next=null;
			this.size--;
			return curr.data;
			
		}
	}
	public void Display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

}
