/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
	public boolean hasPathSum(TreeNode root, int targetSum) {
		return dfs(root, targetSum);
	}

	private boolean dfs(TreeNode node, int remainingSum) {
		if (node == null) {
			return false;
		}

		remainingSum -= node.val;

		if (node.left == null && node.right == null && remainingSum == 0) {
			return true;
		}

		return dfs(node.left, remainingSum) || dfs(node.right, remainingSum);
	}
}