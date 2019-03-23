// Solution: Have a hashmap store the character and number of occurences. The unique character should have only 1 as the value. Loop through string and whichever character has value 1 first, return import junit.framework.TestCase;
// Runtime: O(n)

class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (map.containsKey(s.charAt(i))) {
                int val = map.get(s.charAt(i));
                map.put(s.charAt(i), val + 1);
            }
            else {
                map.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
