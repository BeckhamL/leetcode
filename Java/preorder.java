class Solution {
    public List<Integer> preorder(Node root) {

        if (root == null) {
            return Collections.emptyList();
        }

        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(root.val);

        for (Node child : root.children) {
            ans.addAll(preorder(child));
        }
        return ans;
    }
}
