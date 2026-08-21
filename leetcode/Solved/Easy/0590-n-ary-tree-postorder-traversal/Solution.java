/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {

    private List<Integer> result = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        performPostorderTraversal(root);
        return result;
    }

    public void performPostorderTraversal(Node node) {

        if (node == null) {
            return;
        }
      
        for (Node child : node.children) {
            performPostorderTraversal(child);
        }

        result.add(node.val);

    }
}