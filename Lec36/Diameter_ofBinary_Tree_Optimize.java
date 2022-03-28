package Lec36;

public class Diameter_ofBinary_Tree_Optimize {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public class Diapair {
		int d = 0;
		int ht = -1;
	}

	class Solution {
		public int diameterOfBinaryTree(TreeNode root) {
               return diameter(root).d;
		}

		public Diapair diameter(TreeNode root) {
               if(root==null) {
            	   return new Diapair();
               }
			Diapair ldp = diameter(root.left);
			Diapair rdp = diameter(root.right);
			int sd = ldp.ht + rdp.ht + 2;
			int ht = Math.max(ldp.ht, rdp.ht) + 1;
			Diapair sdp = new Diapair();
			sdp.d=Math.max(sd, Math.max(ldp.d, rdp.d));
			sdp.ht=ht;
			return sdp;
					

		}
	}
}
