class Solution {
    public int numJewelsInStones(String J, String S) {

        int counter = 0;

        for (int i = 0; i < J.length(); i++) {
            for (int k = 0; k < S.length(); k++) {
                if (J.charAt(i) == S.charAt(k)) {
                    counter += 1;
                }
            }
        }
        return counter;
    }
}
