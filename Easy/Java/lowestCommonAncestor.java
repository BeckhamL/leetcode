// VERY SLOW SOLUTION
// Iterate tree until I find the node and keep track of the path in an ArrayList
// iterate through the arraylist and once there is a difference, return the value before
// i one array is reached before the other, return the last item of the shorter array
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return null;
        }

        if (p == root || q == root) {
            return root;
        }

        ArrayList<Integer> pPath = new ArrayList<>();
        ArrayList<Integer> qPath = new ArrayList<>();
        TreeNode curr = root;

        while (curr != null) {
            pPath.add(curr.val);

            if (curr == p) {
                break;
            }

            if (p.val > curr.val) {
                curr = curr.right;
            }
            else {
                curr = curr.left;
            }
        }

        curr = root;
        while (curr != null) {
            qPath.add(curr.val);
            if (curr == q) {
                break;
            }

            if (q.val > curr.val) {
                curr = curr.right;
            }
            else {
                curr = curr.left;
            }
        }

        int max = Math.max(qPath.size(), pPath.size());
        int val = 0;

        for (int i = 0; i < max; i++) {
            if (i >= pPath.size()) {
                val = pPath.get(pPath.size()-1);
                break;
            }
            else if (i >= qPath.size()){
                val = qPath.get(qPath.size()-1);
                break;
            }
            else if (qPath.get(i) != pPath.get(i)) {
                val = pPath.get(i-1);
                break;
            }
        }

        TreeNode ans = new TreeNode(val);
        return ans;
    }
}

// Much faster Solution
// Recursively call; if i reached a root where one path is unable to continue, it must be the last common
// if both paths are able to continue then I keep going
// basically, return the current node that a path cant traverse further
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return null;
        }

        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p , q);
        }
        else if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p , q);
        }
        else {
            return root;
        }
    }
}
