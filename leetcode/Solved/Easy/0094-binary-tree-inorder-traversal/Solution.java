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

    private List<Integer> result = new ArrayList<>();   

    public List<Integer> inorderTraversal(TreeNode root) {

        performInorderDFS(root);
        return result;

    }

    private void performInorderDFS(TreeNode node) {

        if (node == null) {
            return;
        }
      
        performInorderDFS(node.left);
      
        result.add(node.val);
      
        performInorderDFS(node.right);
    }
}