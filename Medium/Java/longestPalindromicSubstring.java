class Solution {

    private int start = 0;
    private int max = 1;

    public String longestPalindrome(String s) {

        if (s.equals(null) || s.length() < 1) {
            return s;
        }


        for (int i = 0; i < s.length(); i++) {
            helper(s, i-1, i+1 ); //odd
            helper(s, i, i+1); //even
        }
         return s.substring(start, start+max);
    }

    public void helper(String s, int head, int tail) {

        while (tail < s.length() && head >= 0 && s.charAt(head) == s.charAt(tail)) {

            int len = tail-head+1;

            if(len > max) {
                max = len;
                start = head;
            }
            head--;
            tail++;
        }
    }
}
