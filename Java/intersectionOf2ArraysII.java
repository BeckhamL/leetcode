// Solution: Create an arraylist of one arrays values, then loop through the second array check if list contains
// create a new arraylist to hold intersection
// Runtime: O(n^2)

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> intersect = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (list.contains(nums2[i])) {
                intersect.add(nums2[i]);
                int index = list.indexOf(nums2[i]);
                list.remove(index);
            }
        }

        int[] ans = new int[intersect.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = intersect.get(i);
        }
        return ans;
    }
}
