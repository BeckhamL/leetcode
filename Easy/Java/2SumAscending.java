// VERY SLOW BRUTE FORCE
class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] answers = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    answers[0] = i + 1;
                    answers[1] = j + 1;
                }
            }
        }
        return answers;
    }
}
