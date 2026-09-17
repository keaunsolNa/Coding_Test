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

    public boolean isUnivalTree(TreeNode root) {

        return isUnivalTreeDFS(root, root.val);
    }

    private boolean isUnivalTreeDFS(TreeNode node, int universalValue) {

        if (node == null) {
            return true;
        }

        return node.val == universalValue
            && isUnivalTreeDFS(node.left, universalValue)
            && isUnivalTreeDFS(node.right, universalValue);
    }
}
