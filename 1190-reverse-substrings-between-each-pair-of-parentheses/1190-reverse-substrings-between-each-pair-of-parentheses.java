class Solution {
    public String reverseParentheses(String s) {
         Stack<String> stack = new Stack<>();
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {

                // Save what we built before '('
                stack.push(current.toString());

                // Start building inside parentheses
                current.setLength(0);

            } 
            else if (ch == ')') {

                // Reverse the current substring
                current.reverse();

                // Get the string before '('
                String previous = stack.pop();

                // Join them
                current.insert(0, previous);

            } 
            else {

                // Normal character
                current.append(ch);
            }
        }

        return current.toString();
    }
}