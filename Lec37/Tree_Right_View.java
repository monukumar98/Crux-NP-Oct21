package Lec37;
import java.util.*;
public class Tree_Right_View {

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
		 int maxdepth = -1;

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ans = new ArrayList<>();
			View(root, 0,ans);
			return ans;
		}

		public void View(TreeNode root, int level,List<Integer> ans ) {
			if (root == null) {
				return;
			}

			if (level > maxdepth) {
				ans.add(root.val);
				maxdepth = level;
			}
			View(root.right, level + 1,ans);
			View(root.left, level + 1,ans);

		}
	}

}
