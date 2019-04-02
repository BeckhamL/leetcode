// Solution: We are simply switching nodes recursively how we have been taught using a temp node. Important to note that
// switching a parent also switches the children. So we can go top to bottom
// Runtime: O(n)

class Solution {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return root;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
