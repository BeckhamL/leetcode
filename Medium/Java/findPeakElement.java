// Solution: Since we are allowed to return the first peak, we know our previous values arent a peak else we would have returned it.
// 3 cases:
// Case 1: array is descending [5,4,3,2,1] => we can just return index 0 since its a peak
// Case 2: array is ascending [1,2,3,4,5] => the for loop condition never passes so highest element is at the end
// Case 3: [2,3,4,5,1] => At my current index, I know all the values before are smaller or else I would have returned, if I see a value smaller than me I return index
// Runtime: O(n)

class Solution {
    public int findPeakElement(int[] nums) {

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i+1]) {
                return i;
            }
        }
        return nums.length-1;
    }
}
