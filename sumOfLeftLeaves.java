/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int value = 0;
    public int sumOfLeftLeaves(TreeNode root) {

        if (root == null) {
            return 0;
        }
        else {
            helper(root);
        }
        return value;
    }

    public void helper(TreeNode node) {

        if (node.left == null && node.right == null) {
            return;
        }

        // If I am at a leaf, get the value
        if(node.left != null && node.left.left == null && node.left.right == null) {
            value = value + node.left.val;
        }
        // If I can go left, go left
        else if (node.left != null) {
            helper(node.left);
        }
        // If i can go right, go right
        if (node.right != null) {
            helper(node.right);
        }
    }
}
