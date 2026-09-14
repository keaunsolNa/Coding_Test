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

    private int universalValue;
    
    public boolean isUnivalTree(TreeNode root) {
        
        universalValue = root.val;
      
        return isUnivalTreeDFS(root);
    }

    private boolean isUnivalTreeDFS(TreeNode node) {

        if (node == null) return true;        
      
        return node.val == universalValue 
            && isUnivalTreeDFS(node.left) 
            && isUnivalTreeDFS(node.right);
    }
}