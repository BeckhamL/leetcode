// Solution: Loop through all the strings in the list. Have a helper function that uses 2 hashmaps as sort of a binding contract.
// In the hasmap I put the first character of the word paired with the first character of the pattern and vice versa. I then check if
// either hashmap has a differing value then return false.
// Runtime: O(n)

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (isMatch(words[i], pattern)) {
                ans.add(words[i]);
            }
        }

        return ans;
    }

    public static boolean isMatch(String word, String pattern) {

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {

            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if (!map.containsKey(w)) {
                map.put(w, p);
            }

            if (!map2.containsKey(p)) {
                map2.put(p, w);
            }

            if (map.get(w) != p || map2.get(p) != w) {
                return false;
            }
        }

        return true;
    }
}
