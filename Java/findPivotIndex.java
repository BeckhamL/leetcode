// Solution: keep track of the sum of the array. check if the left side is equal to the right at the current index.
// Runtime: O(n)

class Solution {
    public int pivotIndex(int[] nums) {

        int sum = 0;
        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        // sum - nums[i] - left sum = the right side of the current value
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - nums[i] - leftSum) {
                return i;
            }
            else {
                leftSum = leftSum + nums[i];
            }
        }
        return -1;
    }
}
