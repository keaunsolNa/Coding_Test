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
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> result = new ArrayList<>();
      
        if (root == null) {
            return result;
        }
      
        Deque<Node> queue = new ArrayDeque<>();
        queue.offer(root);
      
        while (!queue.isEmpty()) {

            List<Integer> currentLevel = new ArrayList<>();
          
            int levelSize = queue.size();
          
            for (int i = 0; i < levelSize; i++) {

                Node currentNode = queue.poll();
                currentLevel.add(currentNode.val);
              
                queue.addAll(currentNode.children);
            }

            result.add(currentLevel);
        }
      
        return result;
    }
}