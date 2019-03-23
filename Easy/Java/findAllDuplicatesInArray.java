class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> duplicates = new ArrayList<Integer>();
        int indexToCheck;

        for (int i=0; i < nums.length; i++) {
            indexToCheck = Math.abs(nums[i]) - 1;
            if(nums[indexToCheck] < 0) {
                duplicates.add(Math.abs(nums[i]));
            } else {
                nums[indexToCheck] *= -1;
            }
        }

        return duplicates;
    }
}
