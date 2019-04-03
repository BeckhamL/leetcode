// Solution: Keep a global counter, anytime I encounter a path where the sum equals to the nodes value, I increment counter.
// I call the helper method from the root, left and right side.
// Runtime: O(n^2)

class Solution {

    static int counter = 0;
    public int pathSum(TreeNode root, int sum) {

        if (root == null) {
            return 0;
        }

        helper(root,sum);
        helper(root.left, sum);
        helper(root.right, sum);

        return counter;
    }

    public static void helper(TreeNode root, int sum) {


        if (root == null) {
            return;
        }

        if (sum == root.val) {
            counter++;
        }

        helper(root.left, sum - root.val);
        helper(root.right, sum - root.val);
    }
}
