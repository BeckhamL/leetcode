// Solution: sort the array first, then return the element
// Runtime: O(n log n)

import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);

        return nums[nums.length - k];
    }
}

// Solution: using a PriorityQueue heap which stores smallest -> largest
// check that the heap size is smaller than k, once you add a new value to the min heap, remove the smallest one which is at head position
// Runtime: O(N log k)

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            heap.add(nums[i]);

            if (heap.size() > k) {
              heap.poll();
          }
        }
        return heap.poll();
    }
}
