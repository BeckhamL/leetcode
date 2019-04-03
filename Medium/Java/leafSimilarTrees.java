// Solution: Keep 2 array lists for both trees. We use a helper function to recursively call to the leaves.
// Once we are at the leaves, add to the array list (do this for both trees). The we compare both lists and check if they
// are the same.
// Runtime: O(n)

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        if (root1 == null) {
            return false;
        }

        if (root2 == null) {
            return false;
        }

        ArrayList<Integer> q1 = new ArrayList<>();
        ArrayList<Integer> q2 = new ArrayList<>();

        dfs(root1, q1);
        dfs(root2, q2);

        if (q1.size() != q2.size()) {
            return false;
        }

        return q1.equals(q2);
    }

    public static void dfs(TreeNode root, ArrayList<Integer> arr) {

        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            arr.add(root.val);
        }

        dfs(root.left, arr);
        dfs(root.right,arr);

    }
}
