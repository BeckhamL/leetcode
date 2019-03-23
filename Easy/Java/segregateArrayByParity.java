// Problem: Sort an array were even numbers are to the left and odd numbers to the right.
// Solution: Keep 2 pointers. If the left is even, move it. If the right is odd move it. The else case will only occur when the left is at an odd and right is at an
// even so we have to switch them.
// Runtime: O(n)

public static int[] seperate(int[] nums) {

    int left = 0;
    int right = nums.length-1;

    while (left < right) {

        if (nums[left] % 2 == 0) {
            left++;
        }
        else if (nums[right] % 2 == 1) {
            right--;
        }
        else {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    return nums;
}
