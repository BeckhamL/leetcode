public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int numberOfOnes = 0;
        int maxOnes = 0;
        int currentLong = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1) {
                numberOfOnes++;
                maxOnes = numberOfOnes;
            }
            if (nums[i] == 0){
                currentLong = maxOnes;
                numberOfOnes = 0;
            }
            if (maxOnes > currentLong) {
                maxOnes = maxOnes;
            }
            else {
                maxOnes = currentLong;
            }
        }
        return maxOnes;
    }
}
