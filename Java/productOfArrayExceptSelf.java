// This solution works but is too slow O(2n)
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            answer[i] = skip(nums,i);
        }
        return answer;
    }

    public static int skip(int[] nums, int skip) {

        int value = 1;

        for (int i = 0; i < nums.length; i++) {
            if (i == skip) {
                continue;
            }
            else {
                value = value * nums[i];
            }
        }
        return value;
    }
}

// fast solution
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        // fill return array with 1's
        for (int i = 0; i < result.length; i++) {
            result[i] = 1;
        }

        int left = 1;
        int right = 1;

        for (int i = 0, j = nums.length - 1; i < nums.length - 1; i++, j--) {
            left = left * nums[i];
            right = right * nums[j];
            result[i + 1] = result[i + 1] * left;
            result[j - 1] = result[j - 1] * right;
        }

        return result;
    }
}
