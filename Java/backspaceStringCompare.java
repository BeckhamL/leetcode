// Solution: loop through string, if my stack has values and I see '#', pop the last value. Else just add into stack and make comparisons. If the
// sizes are different then immediately reject.
// Runtime: O(n)

class Solution {
    public boolean backspaceCompare(String S, String T) {

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#' && stack1.isEmpty()) {
                continue;
            }
            else if (S.charAt(i) == '#') {
                stack1.pop();
            }
            else {
                stack1.push(S.charAt(i));
            }
        }

        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) == '#' && stack2.isEmpty()) {
                continue;
            }
            else if (T.charAt(i) == '#') {
                stack2.pop();
            }
            else {
                stack2.push(T.charAt(i));
            }
        }

        if (stack1.isEmpty() && stack2.isEmpty()) {
            return true;
        }

        if(stack1.size() != stack2.size()) {
            return false;
        }


        for (int i = 0; i < stack1.size(); i++) {
            char a = stack1.pop();
            char b = stack2.pop();
            if (a != b) {
                return false;
            }
        }
        return true;
    }
}
