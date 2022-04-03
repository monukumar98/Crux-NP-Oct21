package Lec38;

public class Symmetric_Tree {
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

	class Solution {
		public boolean isSymmetric(TreeNode root) {

			if (root == null) {
				return true;
			}
			return Mirror(root.left, root.right);

		}

		public boolean Mirror(TreeNode t1, TreeNode t2) {
			if (t1 == null && t2 == null) {
				return true;
			}
			if (t1 == null || t2 == null) {
				return false;
			}
			if (t1.val != t2.val) {
				return false;
			}

			boolean left = Mirror(t1.left, t2.right);
			boolean right = Mirror(t1.right, t2.left);
			return left && right;

		}

	}
}
