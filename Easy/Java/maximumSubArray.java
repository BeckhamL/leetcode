// Solution: iterate through every combination and keep track of the max summation of values
// Runtime: O(n^2)

class Solution {
    public int maxSubArray(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int accum = nums[i];

            if (accum > max) {
                max = accum;
            }

            for (int j = i+1; j < nums.length; j++) {
                accum = accum + nums[j];

                if (accum > max) {
                    max = accum;
                }
            }
        }
        return max;
    }
}

// Solution: Dynamic programming approach. make the decision if my previous subarray was better or my current value is better. 
// Runtime: O(n)

class Solution {
    public int maxSubArray(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int accum = nums[0];
        int soFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            accum = Math.max(nums[i] + accum, nums[i]);
            soFar = Math.max(accum, soFar);
        }
        return soFar;
    }
}
