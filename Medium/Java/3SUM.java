// Solution: Sort the array. If the 3 values add to 0, add to list and check if there is a duplicate; skip it. If the value is lower than 0
// we move the left pointer to get a bigger value. If the value is greater than 0, move right pointer so value is smaller.
// Runtime: O(n^2)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums); // Sort the original array
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 3) {
            return result;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) { // Skip duplicated first number
                continue;
            }

            int low = i + 1;
            int high = nums.length - 1;

            while (low < high) {
                int sum = nums[low] + nums[high] + nums[i];

                if (nums[low] + nums[high] + nums[i] == 0) {

                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));

                    while (low < high && nums[low] == nums[low+1]) { // Skip duplicated second number
                        low++;
                    }

                    while (low < high && nums[high] == nums[high-1]) { // Skip duplicated third number
                        high--;
                    }

                    low++;
                    high--;

                } else if (sum < 0) {
                    low++;

                } else {
                    high--;
                }
            }
        }

        return result;
    }
}
