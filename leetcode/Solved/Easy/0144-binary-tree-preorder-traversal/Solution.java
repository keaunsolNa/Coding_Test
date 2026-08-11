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

    public List<Integer> preorderTraversal(TreeNode root) {
             
        performPreorderDFS(root);
        return result;   
    }

    private void performPreorderDFS(TreeNode node) {

        if (node == null) {
            return;
        }
      
        result.add(node.val);
      
        performPreorderDFS(node.left);
      
        performPreorderDFS(node.right);
        
    }

}