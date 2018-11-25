// Loop through the string and append each character into a word until I see spaces.
// Once I see spaces, reverse the word and add it to my final return string.
// Reset the word
// Return answer + my last word since there will not be a space after the last word the else case wont trigger

class Solution {
    public String reverseWords(String s) {
        StringBuilder word = new StringBuilder();
        String answer = "";
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ') {
                word.append(s.charAt(i));
            }
            else {
                answer = answer + word.reverse() +  " ";
                word.setLength(0);
                }
        }
        return answer + word.reverse();
    }
}
