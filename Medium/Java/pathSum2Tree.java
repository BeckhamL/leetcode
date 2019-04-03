// Solution: Call my helper function to recursive look at every path. If I reach a leaf node and the sum is the target, add into
// answer array list. If its not, call on left and right sub tree. This is not space efficient since a new arraylist is being made
// at every recursive call.
// Runtime: O(n)

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return Collections.emptyList();
        }

        helper(root, sum, new ArrayList<Integer>(), ans);

        return ans;

    }

    public static void helper(TreeNode root, int sum, List<Integer> current, List<List<Integer>> ans) {

        if (root == null) {
            return;
        }

        current.add(root.val);

        if(root.left == null && root.right == null && root.val == sum) {
            ans.add(current);
            return;
        }

        helper(root.left, sum - root.val, new ArrayList<Integer>(current), ans);
        helper(root.right, sum - root.val, new ArrayList<Integer>(current), ans);

    }
}
