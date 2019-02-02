// Solution: Get the binary representation of n. Iterate through the string and if 2 consecutive numbers are the same return false.
// Runtime: O(n)

class Solution {
    public boolean hasAlternatingBits(int n) {

        String s = Integer.toBinaryString(n);

        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }
}
