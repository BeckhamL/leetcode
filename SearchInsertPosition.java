public class Solution {
    public int searchInsert(int[] nums, int target) {

        int indexLocation = 0;

        for (int i = 0; i < nums.length; i++){
            if (target > nums[i]) {
                indexLocation++;
            }
        }
        return indexLocation;
    }
}
