package Lec36;

import java.util.*;

public class Level_Order_Traversal {
	Scanner sc = new Scanner(System.in);

	public class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public Level_Order_Traversal() {
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

	public void levelorder() {

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);// add --> addlast
		while (queue.isEmpty() == false) {
			Node rn = queue.remove();// remove first
			System.out.print(rn.data + " ");

			if (rn.left != null) {
				queue.add(rn.left);
			}
			if (rn.right != null) {
				queue.add(rn.right);
			}

		}
		System.out.println();

	}

	public void levelorderlinewise() {
		Queue<Node> Helper = new LinkedList<>();
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);// add --> addlast
		while (queue.isEmpty() == false) {
			Node rn = queue.remove();// remove first
			System.out.print(rn.data + " ");

			if (rn.left != null) {
				Helper.add(rn.left);
			}
			if (rn.right != null) {
				Helper.add(rn.right);
			}
			if (queue.isEmpty() == true) {
				System.out.println();
				queue = Helper;
				Helper = new LinkedList<>();

			}

		}
		System.out.println();

	}
	
	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {
		// TODO Auto-generated method stub
		if(node==null) {
			return -1;
		}
		
		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh)+1;
	}

	public static void main(String[] args) {
		Level_Order_Traversal lv = new Level_Order_Traversal();
//		lv.levelorder();
//		lv.levelorderlinewise();
		System.out.println(lv.ht());
	}

}
