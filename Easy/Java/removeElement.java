// need to remove an element from an array in place and return the length of array.
// if my current element is to be removed, replace it with the last index

class Solution {
    public int removeElement(int[] nums, int val) {

        int left = 0;
        int right = nums.length;

        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right-1];
                right--;
            }
            else {
                left++;
            }
        }
        return left;
    }
}
