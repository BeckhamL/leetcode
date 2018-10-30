import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

        int value = 0;
        int missing = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                value++;
            }
        }
        return value;
    }
}
