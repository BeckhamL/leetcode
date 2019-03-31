// Solution: Keep a hashmap of the complement of the target and index. If the complement isnt in the hashmap, add the current index and value. Else return the elements' complement
// and index
// Runtime: O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(target-nums[i])) {
                map.put(nums[i], i);
            }
            else {
                ans[0] = map.get(target-nums[i]);
                ans[1] = i;
            }
        }
        return ans;
    }
}
