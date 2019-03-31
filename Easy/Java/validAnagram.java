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

// Solution: Go through each string and add the character frequency to the letters array. Loop through both letter arrays and
// if the values are different, return false.
// Runtime: O(n)

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        int[] letters1 = new int[26];
        int[] letters2 = new int[26];

        for (int i = 0; i < arr1.length; i++) {
            letters1[arr1[i]-'a']++;
        }

        for (int i = 0; i < arr2.length; i++) {
            letters2[arr2[i]-'a']++;
        }

        for (int i = 0; i < letters1.length; i++) {
            if (letters1[i] != letters2[i]) {
                return false;
            }
        }

        return true;
    }
}
