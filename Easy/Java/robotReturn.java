class Solution {
    public boolean judgeCircle(String moves) {

        boolean isTrue = false;
        Character[] chars = new Character[moves.length()];
        int u = 0;
        int d = 0;
        int l = 0;
        int r = 0;

        for (int i = 0; i < moves.length(); i++) {
            chars[i] = moves.charAt(i);
        }

        for (int i = 0; i < chars.length; i++){
            if (chars[i] == 'D') {
                d = d + 1;
            }
            else if (chars[i] == 'U') {
                u = u + 1;
            }
            else if (chars[i] == 'R') {
                r = r +1;
            }
            else {
                l = l + 1;
            }
        }

        if (d == u && l == r) {
            isTrue = true;
        }
        else {
            isTrue = false;
        }

        return isTrue;
    }
}
