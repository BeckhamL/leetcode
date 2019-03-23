// Very slow solution
// Add all chars into arraylist, iterate through the first string and remove common chars
// if arraylist is empty, true else false
class Solution {
    public boolean isAnagram(String s, String t) {

        ArrayList<Character> tString = new ArrayList<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < t.length(); i++) {
            tString.add(t.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            if (tString.contains(s.charAt(i))) {
                int index = tString.indexOf(s.charAt(i));
                tString.remove(index);
            }
        }

        if (tString.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}

// Solution: make both strings into char arrays and sort. Since they are anagrams they should contain the same values. Iterate and if they arent the same return false
// Runtime: O(n log n)

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        // O(n log n)
        Arrays.sort(s1);
        Arrays.sort(s2);

        // O(n)
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != s2[i]) {
                return false;
            }
        }
        return true;
    }
}
