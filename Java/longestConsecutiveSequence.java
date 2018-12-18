// Sort the array first O(nlogn)
// If the current number and the previous are equal, then our current sequence is neither extended nor broken, so we simply move on to the next number
// if the number and the previous are 1 apart, increment the counter, else check for the max value
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
        int j = 1;

        for (int i = 0; i < nums.length; i++) {
            for (j = i + j; j < nums.length; j++) {
                if (nums[j] != nums[j-1]) {
                    if (nums[j] == nums[j-1] + 1) {
                        curr++;
                    }
                    else {
                        if (curr > max) {
                            max = curr;
                        }
                        curr = 1;
                        j = 1;
                        break;
                    }
                }
            }
        }
        return Math.max(curr, max);
    }
}
