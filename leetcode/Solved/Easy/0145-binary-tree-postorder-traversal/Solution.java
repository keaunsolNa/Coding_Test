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

    public List<Integer> postorderTraversal(TreeNode root) {

        performPostorderDFS(root);
        return result;

    }

    private void performPostorderDFS(TreeNode node) {

        if (node == null) {
            return;
        }
      
        performPostorderDFS(node.left);
      
        performPostorderDFS(node.right);
      
        result.add(node.val);        
    }
}