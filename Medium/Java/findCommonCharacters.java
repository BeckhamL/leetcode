// Solution: Loop through all the individual strings and have an array keep track of the frequency of the chars for that
// specific string. Then we loop through and check for the minimum occurences of frequencies for all the strings and that specific string.
// Runtime: O(n^2)

class Solution {
    public List<String> commonChars(String[] A) {

        List<String> ans = new ArrayList<>();

        int[] letters = new int[26];

        // We need to do this or else we won't be able to find the minimum since (0, anything) will always be 0
        Arrays.fill(letters, Integer.MAX_VALUE);

        for (int i = 0; i < A.length; i++) {

            int[] letter_frequencies = new int[26];

            for (int j = 0; j < A[i].length(); j++) {

                 char c = A[i].charAt(j);
                 letter_frequencies[c-'a']++;
            }

            for (int k = 0; k < 26; k++) {
                letters[k] = Math.min(letter_frequencies[k], letters[k]);
            }
        }

        for (int i = 0; i < 26;i++) {

            if (letters[i] > 0) {

                while (letters[i] != 0) {
                    ans.add(String.valueOf((char)(i + 97)));
                    letters[i]--;
                }

            }
        }
        return ans;
    }
}
