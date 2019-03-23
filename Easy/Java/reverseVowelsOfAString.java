// Solution: Similar to reversing a string. We need to check that left and right are both vowels. If the left isnt a vowel, only increment left. If the right isnt
// a vowel only decrement right.
// Runtime: O(n)

class Solution {
    public String reverseVowels(String s) {

        char[] str = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (str[left] == 'a' || str[left] == 'e' || str[left] == 'i' || str[left] == 'o' || str[left] == 'u'
               || str[left] == 'A' || str[left] == 'E' || str[left] == 'I' || str[left] == 'O' || str[left] == 'U') {
                char temp = str[left];
                if (str[right] == 'a' || str[right] == 'e' || str[right] == 'i' || str[right] == 'o' || str[right] == 'u'
                   || str[right] == 'A' || str[right] == 'E' || str[right] == 'I' || str[right] == 'O' || str[right] == 'U') {

                    str[left] = str[right];
                    str[right] = temp;
                    left++;
                    right--;
                }
                else {
                    right--;
                }
            }
            else {
                left++;
            }
        }

        return new String(str);

    }
}
