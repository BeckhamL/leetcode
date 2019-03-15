// Sort the array first O(nlogn)
// If 2 numbers are the same next to each other, continue loop. If a number and its previous is 1 apart
// increment the counter. We can just reset the counter otherwise.
// Runtime: O(nlogn)

import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int max = 1;
        int curr = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i-1]) {
                continue;
            }

            if (nums[i] == nums[i-1] + 1) {
                curr++;
            }
            else {
                curr = 1;
            }

            max = Math.max(max, curr);
        }

        return max;
    }
}
