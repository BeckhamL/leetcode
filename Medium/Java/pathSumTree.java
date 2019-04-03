// Solution: If I am at a leaf node and the value passed equals the leaf value, this means there was a valid path so return true.
// If we are not at a leaf node, we recursively call into left and right. Its OR since if any path sums to value we can return.
// Runtime: O(n)

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {

        if (root == null) {
            return false;
        }

        return helper(root, sum);
    }

    public static boolean helper(TreeNode root, int sum) {

        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null && root.val == sum) {
            return true;
        }

        return helper(root.left, sum - root.val) || helper(root.right, sum - root.val);
    }
}
