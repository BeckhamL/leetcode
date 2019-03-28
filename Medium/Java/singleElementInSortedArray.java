// Solution: Keep hashmap of number and frequency, return the key that has value = 1
// Runtime: O(n)

class Solution {
    public int singleNonDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
            else {
                int val = map.get(nums[i]);
                map.put(nums[i], val+1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}

// Solution: Since its sorted and every number appears once besides one. I check adjacent values and if they are differnt return the index.
// Else the value is in the last index.
// Runtime: O(n)

class Solution {
    public int singleNonDuplicate(int[] nums) {

        for (int i = 0; i < nums.length-1; i+=2) {

            if (nums[i] != nums[i+1]) {
                return nums[i];
            }
        }

        return nums[nums.length-1];
    }
}
