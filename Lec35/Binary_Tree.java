package Lec35;

import java.util.Scanner;

public class Binary_Tree {
	Scanner sc = new Scanner(System.in);

	public class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public Binary_Tree() {
		// TODO Auto-generated constructor stub

		this.root = CraeteTree();

	}

	private Node CraeteTree() {

		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = CraeteTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = CraeteTree();
		}
		return nn;

	}

	public void dispaly() {
		dispaly(this.root);
	}

	private void dispaly(Node node) {
		if (node == null) {
			return;
		}
		String str = "<--";
		str = str + node.data + "-->";
		if (node.left != null) {
			str = node.left.data + str;
		} else {
			str = "." + str;
		}

		if (node.right != null) {
			str = str + node.right.data;
		} else {
			str = str + ".";
		}
		System.out.println(str);
		dispaly(node.left);
		dispaly(node.right);

	}

	public boolean find(int item) {
		return find(this.root, item);

	}

	private boolean find(Node node, int item) {
		// TODO Auto-generated method stub
		if(node==null) {
			return false;
		}
		if (node.data == item) {
			return true;
		}

		boolean left = find(node.left, item);
		boolean right = find(node.right, item);
		return left || right;

	}

}
