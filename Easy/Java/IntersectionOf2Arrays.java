// Original Solution
// Nested for loop to check if the values match, if they check if ArrayList contains value if not add
// Runtime: O(n^2)

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (!list.contains(nums1[i])) {
                        list.add(nums1[i]);
                    }
                }
            }
        }

        int[] answers = new int[list.size()];

        for (int i = 0; i < answers.length; i++) {
            answers[i] = list.get(i);
        }
        return answers;
    }
}

// New Solution
// Same idea but using hashset instead of ArrayList
// HashSet contains is O(1) where ArrayList contains is O(n)
// HashSet doesnt allow duplicates so [1,2,2,1] -> [1,2]
// RunTime: O(n)

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        for (int x : nums1) {
            set.add(x);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                ans.add(nums2[i]);
            }
        }

        int[] arr = new int[ans.size()];

        int index = 0;
        for (int s : ans) {
            arr[index] = s;
            index++;
        }
        return arr;
    }
}
