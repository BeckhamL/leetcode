// Solution: This is the sliding window solution. I keep a fast and slow pointer. use a hashset since lookup is O(1). If my set doesnt contain fast, add and increment fast
// Check for max in this case. If set contains fast, I start making my window smaller and move the slow pointer. I remove the slow element from the set to start closing the window
// Runtime: O(n)

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;
        int slow = 0;
        int fast = 0;

        HashSet<Character> seen = new HashSet<>();

        while (slow < s.length() && fast < s.length()) {

            if (!seen.contains(s.charAt(fast))) {

                seen.add(s.charAt(fast));
                fast++;

                max = Math.max(max, fast-slow);
            }
            else {
                seen.remove(s.charAt(slow));
                slow++;
            }
        }
        return max;
    }
}
