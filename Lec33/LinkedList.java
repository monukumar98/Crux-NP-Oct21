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
		if(this.size==0) {
			addfirst(item);
		}
		else {
			Node nn = new Node(item);
			this.tail.next=nn;
			this.tail=nn;
			this.size++;
		}
	}

	public void Display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

}
