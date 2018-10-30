class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        boolean isTrue = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }
            else if (s.charAt(i) == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                else if (stack.peek() == '(') {
                    stack.pop();
                }
            }
            else if (s.charAt(i) == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return false;
                }
                else if (stack.peek() == '[') {
                    stack.pop();
                }
            }
            else if (s.charAt(i) == '}') {
                if (stack.isEmpty() || stack.peek() != '{') {
                    return false;
                }
                else if (stack.peek() == '{') {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            isTrue = true;
        }
        else {
            isTrue = false;
        }
        return isTrue;
    }
}
