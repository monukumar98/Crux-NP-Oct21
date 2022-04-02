package Lec37;

import java.util.LinkedList;
import java.util.Scanner;

public class Level_Order_Tree {
	Scanner sc = new Scanner(System.in);

	public class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public Level_Order_Tree() {
		// TODO Auto-generated constructor stub
		this.root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		LinkedList<Node> queue = new LinkedList<>();
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		this.root = nn;
		queue.add(nn);// add --> addlast
		while (queue.isEmpty() == false) {

			Node rv = queue.remove();

			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node n = new Node();
				n.data = c1;
				rv.left = n;
				queue.add(n);
			}
			if (c2 != -1) {
				Node n = new Node();
				n.data = c2;
				rv.right = n;
				queue.add(n);
			}

		}
		return root;

	}
}
