package Lec38;

public class Sum_Root_to_Leaf_Numbers {
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
		public int sumNumbers(TreeNode root) {
        return SN(root, 0);
		}

		public int SN(TreeNode root, int curr) {

			if (root == null) {
				return 0;
			}
			if (root.left == null && root.right == null) {
				return curr * 10 + root.val;
			}

			int lf = SN(root.left, curr * 10 + root.val);
			int rf = SN(root.right, curr * 10 + root.val);
			return lf + rf;

		}
		
	}
}
