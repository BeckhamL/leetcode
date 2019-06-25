class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<Integer>());

        for (int i = nums.length-1; i >= 0; i--) {
            int max = answer.size();

            for (int j = 0; j < max; j++) {
                List<Integer> curr = new ArrayList<>(answer.get(j));
                curr.add(nums[i]);
                answer.add(curr);
            }
        }

        return answer;
    }
}
