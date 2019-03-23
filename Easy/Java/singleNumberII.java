// Solution: iterate the array and add values to hashmap and counter. Loop the hashmap and get the key whose value == 1
// Runtime: O(n)

class Solution {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        // Loop through array storing values into hashmap
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int value = map.get(nums[i]);
                map.put(nums[i], value + 1);
            }
            else {
                map.put(nums[i], 1);
            }
        }

        // Loop through hashmap and check if a value == 1
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
