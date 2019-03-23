class Solution {
    public int singleNumber(int[] nums) {

        ArrayList<Integer> answers = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (answers.contains(nums[i])) {
                answers.remove((Integer) nums[i]);
            }
            else {
                answers.add(nums[i]);
            }
        }
        return answers.get(0);
    }
}
