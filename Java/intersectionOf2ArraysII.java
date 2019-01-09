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

// Solution: sort both arrays. keep 2 pointers at the start, if one value is greater than the other, increment the lesser value pointer
// Runtime: O(n log n)

import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        int index1 = 0;
        int index2 = 0;

        // O(n log n)
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> ans = new ArrayList<>();

        while (index1 < nums1.length && index2 < nums2.length) {

            if (nums1[index1] == nums2[index2]) {
                ans.add(nums1[index1]);
                index1++;
                index2++;
            }
            else if (nums1[index1] > nums2[index2]) {
                index2++;
            }
            else {
                index1++;
            }
        }

        int[] arr = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
}
