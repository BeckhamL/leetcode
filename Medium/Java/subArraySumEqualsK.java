// Solution: The map stores the cumalative sum and how many times it has occured. If any key in the hashmap equals sum-k, that means
// this is a sub array that sums to k so increase count by how many times it occured
// Runtime: O(n)

class Solution {
    public int subarraySum(int[] nums, int k) {

        int sum = 0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];

            if (map.get(sum-k) != null) {
                count = map.get(sum-k) + count;
            }

            if (sum == k) {
                count++;
            }

            if (map.get(sum) != null) {
                map.put(sum, map.get(sum)+1);
            }
            else {
                map.put(sum,1);
            }
        }
        return count;
    }
}
