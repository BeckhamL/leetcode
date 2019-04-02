// Solution: Since I want a balanced binary search tree, my root will be at the middle of the array. I then recursively call my helper
// function for my left and right child. Left child is first half of array, right child is second half of array.
// Runtime: O(n)

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums == null || nums.length < 1) {
            return null;
        }

        return makeBST(nums, 0, nums.length-1);
    }

    public TreeNode makeBST(int[] nums, int left, int right) {

        if (left > right) {
            return null;
        }

        int mid = left + (right-left)/2;
        TreeNode curr = new TreeNode(nums[mid]);

        curr.left = makeBST(nums,left, mid-1);
        curr.right = makeBST(nums, mid+1, right);

        return curr;

    }
}
