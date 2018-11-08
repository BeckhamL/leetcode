import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Double> hash = new HashMap<>();
        double length = nums.length/2.0;
        int returnValue = 0;

        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                double value = hash.get(nums[i]);
                hash.put(nums[i], value + 1.0);
            }
            else {
                hash.put(nums[i], 1.0);
            }
        }

        for (Map.Entry<Integer, Double> entry : hash.entrySet()) {
            if (entry.getValue() >= length) {
                returnValue = entry.getKey();
            }
        }
         return returnValue;
    }
}
