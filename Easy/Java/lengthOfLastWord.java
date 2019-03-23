// Solution: Create an array where the values are each a string of the sentence. Get the length of the last index.
// Runtime: O(n)

class Solution {
    public int lengthOfLastWord(String s) {

        String[] arr = s.split("\\s+");

        if (arr.length == 0) {
            return 0;
        }

        String last = arr[arr.length -1];

        return last.length();
    }
}
