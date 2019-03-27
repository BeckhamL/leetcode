// Solution: Create a queue and add the root since it wont be null. A queue is FIFO so since we are adding left to right, import junit.framework.TestCase;
// follows BFS. We loop through the queue and add the values into the arraylist, we then check if the node has a left and right. If it does add.
// Runtime: O(2n)

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();        // Make a new size or else it wont work
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode curr = queue.poll();
                level.add(curr.val);

                if (curr.left != null) {
                    queue.add(curr.left);
                }

                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }

            ans.add(level);
        }

        return ans;
    }
}
