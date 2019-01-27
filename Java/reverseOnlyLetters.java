// Solution: Same idea as reversing a string. Check if character is a letter, if not move pointer if both chars are letters
// swap them
// Runtime: O(n)

import java.util.*;

class Solution {
    public String reverseOnlyLetters(String S) {

        char[] chars = S.toCharArray();

        int first = 0;
        int last = S.length() - 1;

        while (first < last) {
            if (!(Character.isLetter(chars[first]))) {
                first++;
            }
            else if (!(Character.isLetter(chars[last]))) {
                last--;
            }
            // switch chars
            else {
                char temp = chars[first];
                chars[first] = chars[last];
                chars[last] = temp;
                first++;
                last--;
            }
        }
        return new String(chars);
    }
}

// forgot I solved it. Intuition is the same as before.
// Runtime: O(n)

class Solution {
    public String reverseOnlyLetters(String S) {

        int first = 0;
        int last = S.length() -1;

        char[] chars =  S.toCharArray();

        while (first < last) {
            if (Character.isLetter(chars[first])) {
                char temp = chars[first];
                if (Character.isLetter(chars[last])) {

                    chars[first] = chars[last];
                    chars[last] = temp;
                    first++;
                    last--;
                }
                else {
                    last--;
                }
            }
            else {
                first++;
            }
        }
        return new String(chars);
    }
}
