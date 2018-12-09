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
