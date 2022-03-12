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
	
	
	public int getfirst() throws Exception  {
		if(this.size==0) {
			throw new  Exception("Linked List is empty");
		}
		
		return this.head.data;
	}
	public int getLast() throws Exception  {
		if(this.size==0) {
			throw new  Exception("Linked List is empty");
		}
		
		return this.tail.data;
	}
	public int getatindex(int k) throws Exception {
		return GetNode(k).data;
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
