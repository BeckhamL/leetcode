// Solution: Try to go left and right, each time I can recursively go down another node, I increase my depth counter.
// Runtime: O(n)

class Solution {
    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right) + 1;
        }
    }
}
