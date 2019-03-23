// Problem: Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
// Solution: The max value can be the current value, the max * the current or, min * current (2 negative numbers). We also need to keep track of the minimum.
// Runtime: O(n)

public class Solution {
    public int maxProduct(int[] A) {

        if (A == null || A.length == 0) {
            return 0;
        }

        int max = A[0], min = A[0], result = A[0];

        for (int i = 1; i < A.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * A[i], min * A[i]), A[i]);
            min = Math.min(Math.min(temp * A[i], min * A[i]), A[i]);
            if (max > result) {
                result = max;
            }
        }
        return result;
    }
}
