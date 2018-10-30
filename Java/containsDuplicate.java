import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        boolean contains = false;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i + 1]) {
                contains = true;
                break;
            }
            else {
                contains = false;
            }
        }
        return contains;
    }
}
