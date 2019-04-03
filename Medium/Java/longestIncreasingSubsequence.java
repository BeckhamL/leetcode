// Solution: Dynamic programming. TBH no idea how this really works
// Runtime: O(n^2)

class Solution {
    public int lengthOfLIS(int[] nums) {

        if (nums.length == 0) {
            retun 0;
        }

        int[] dp = new int[nums.length];
        int max = 0;
        dp[0] = 1;

        for (int i = 1; i < nums.length; i++) {

            int curr = 0;
            for (int j = 0; j < i; j++) {

                if(nums[i] > nums[j]) {
                    curr = Math.max(curr, dp[j]);
                }
            }

            dp[i] = curr+1;
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
