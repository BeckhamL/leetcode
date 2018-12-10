// Slower solution.
// Add all the chars of t into arraylist O(n)
// if the char is in s, remove O(2n)
// return the last char in arraylist O(n)
class Solution {
    public char findTheDifference(String s, String t) {

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < t.length(); i++) {
            list.add(t.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))) {
                int index = list.indexOf(s.charAt(i));
                list.remove(index);
            }
        }

        char ans = list.get(0);

        return ans;
    }
}

// Faster solution.
// Sort the 2 arrays first O(nlogn)
// once I find a difference i return the chars O(n)
// or it will be in the end since its sorted
class Solution {
    public char findTheDifference(String s, String t) {

        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();

        Arrays.sort(schar);
        Arrays.sort(tchar);

        for (int i = 0; i < schar.length; i++) {
            if (schar[i] != tchar[i]) {
                return tchar[i];
            }
        }
        return tchar[tchar.length - 1];
    }
}
