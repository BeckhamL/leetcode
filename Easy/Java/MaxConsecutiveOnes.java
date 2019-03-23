// Updated Solution
// Loop through the list, if I see a '1' increment counter else keep track of max
// Runtime: O(n)

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int numberOfOnes = 0;
        int maxOnes = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1) {
                numberOfOnes++;
            }
            if (nums[i] == 0){
                if (numberOfOnes > maxOnes) {
                    maxOnes = numberOfOnes;
                }
                numberOfOnes = 0;
            }
        }

        if (numberOfOnes > maxOnes) {
            return numberOfOnes;
        }
        else {
            return maxOnes;
        }
    }
}
