package Lec34;

public class Flyod_Cycle_Detacion {
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

	public void CreateCycle() {
		this.tail.next = this.head;
	}
	
	public boolean Cycle_Detacion() {
		Node slow=this.head;
		Node fast=this.head;
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}

	public void Display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public static void main(String[] args) {
		Flyod_Cycle_Detacion fc = new Flyod_Cycle_Detacion();
		fc.addlast(1);
		fc.addlast(2);
		fc.addlast(3);
		fc.addlast(4);
		//fc.CreateCycle();
		//fc.Display();
		System.out.println(fc.Cycle_Detacion());
	}

}
