// Solution: First we loop from left to right, if we find the target, update the array[0] to be the index and make sure to break so we dont keep looping.
// We then check if the array[0] == -1 means we didnt find the target in the array and we can return [-1,-1]. Loop from right to left, and once we find the
// target update array[1].
// Runtime: O(n)

class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] temp = {-1,-1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                temp[0] = i;
                break;
            }
        }

        if (temp[0] == -1) {
            return temp;
        }

        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] == target) {
                temp[1] = i;
                break;
            }
        }

        return temp;
    }
}
