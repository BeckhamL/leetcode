import java.util.*;
class Solution {
    public List<Integer> postorder(Node root) {

        if (root == null) {
           return Collections.emptyList();
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (Node child : root.children) {
            ans.addAll(postorder(child));
        }
        ans.add(root.val);
        return ans;
    }
}
