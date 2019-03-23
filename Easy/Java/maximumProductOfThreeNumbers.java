// Solution: sort all the numbers first, either the max will be in the last 3 or the last + the first 2 (since 2 negative numbers)
// Runtime: O(n log n)

class Solution {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        return Math.max(nums[0] * nums[1] * nums[nums.length-1],nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3] );
    }
}
