package Lec37;

public class Binary_Search_Tree {
	public class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public Binary_Search_Tree(int[] in) {
		// TODO Auto-generated constructor stub
		this.root = CreateTree(in, 0, in.length - 1);

	}

	private Node CreateTree(int[] in, int si, int ei) {
		// TODO Auto-generated method stub
		if(si>ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node nn = new Node();
		nn.data = in[mid];
		nn.left = CreateTree(in, si, mid - 1);
		nn.right = CreateTree(in, mid + 1, ei);
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

}
