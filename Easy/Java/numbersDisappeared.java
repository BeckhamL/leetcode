class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i < nums.length;i++) {
            int val = Math.abs(nums[i]);
            if(nums[val-1] > 0) {
                nums[val-1] *= -1;
            }
        }

        for(int index=0;index<nums.length;index++) {
            if(nums[index] > 0) {
                answer.add(index+1);
            }
        }

        return answer;
    }
}
