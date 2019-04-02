// Solution: keep a global hashset, since I know hashsets dont contain duplicates, if the size is greater than 1 then I know
// the tree had different values.
// Runtime: O(n)

class Solution {

    HashSet<Integer> set = new HashSet<>();

    public boolean isUnivalTree(TreeNode root) {

        if (root == null) {
            return true;
        }

        set.add(root.val);

        if (set.size() > 1) {
            return false;
        }

        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}
