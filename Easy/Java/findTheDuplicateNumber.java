// Solution: Sort the numbers first, since there are no duplicates besides the duplicating number, if 2 numbers next to each other are the same return that number
// Runtime: O(n)

class Solution {
    public int findDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                return nums[i];
            }
        }
        return 0;
    }
}
