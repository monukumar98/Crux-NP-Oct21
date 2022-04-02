package Lec37;

public class Delete_Node_in_a_BST {

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
// right min
	class Solution {
		public TreeNode deleteNode(TreeNode root, int key) {
             return delete(root, key);
		}

		public TreeNode delete(TreeNode root, int key) {
			if (root == null) {
				return null;
			}

			if (root.val > key) {
				root.left = delete(root.left, key);
			} else if (root.val < key) {
				root.right = delete(root.right, key);
			} else {
				// 1 or 0 child Exits
				if (root.left == null) {
					return root.right;
				}

				else if (root.right == null) {
					return root.left;
				}
				else {
					
					int min = min(root.right);
					delete(root.right, min);
					root.val=min;
				}

			}
			return root;

		}
		
		public int  min(TreeNode root) {
			if(root==null) {
				return Integer.MAX_VALUE;
			}
			int min = min(root.left);
			return Math.min(root.val, min);
		}

	}
	
	
	
	
	// left max 
	class Solution1 {
		public TreeNode deleteNode(TreeNode root, int key) {
             return delete(root, key);
		}

		public TreeNode delete(TreeNode root, int key) {
			if (root == null) {
				return null;
			}

			if (root.val > key) {
				root.left = delete(root.left, key);
			} else if (root.val < key) {
				root.right = delete(root.right, key);
			} else {
				// 1 or 0 child Exits
				if (root.left == null) {
					return root.right;
				}

				else if (root.right == null) {
					return root.left;
				}
				else {
					
					int min = max(root.left);
					root.left=delete(root.left, min);
					root.val=min;
				}

			}
			return root;

		}
		
		public int  max(TreeNode root) {
			if(root==null) {
				return Integer.MIN_VALUE;
			}
			int min = max(root.right);
			return Math.max(root.val, min);
		}

	}
	
	

}
