/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {

        int counter = 0;

        if (root == null) {
            return counter;
        }

        for(Node child : root.children){
           counter =  Math.max(maxDepth(child), counter);
        }
        return counter + 1;
    }
}
