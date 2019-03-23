// Solution: Sort the array, if 2 numbers next to each other the same return true; else return false.
// Runtime: O(n log n)

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

// Solution: Use a hashmap to store values I have seen before, if hashmap contains the key return true; else false.
// Runtime: O(n)

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            else {
                map.put(nums[i], 0);
            }
        }
        return false;
    }
}
