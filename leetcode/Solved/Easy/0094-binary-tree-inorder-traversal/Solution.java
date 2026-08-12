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

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        performInorderDFS(root, result);
        return result;

    }

    private void performInorderDFS(TreeNode node, List<Integer> result) {

        if (node == null) {
            return;
        }

        performInorderDFS(node.left, result);

        result.add(node.val);

        performInorderDFS(node.right, result);
    }
}
