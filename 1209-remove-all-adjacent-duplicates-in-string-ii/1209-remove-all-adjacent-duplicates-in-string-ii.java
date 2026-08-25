class Pair{
    char ch;
    int count;
    Pair(char ch,int count)
    {
        this.ch=ch;
        this.count=count;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
      Stack<Pair> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Stack is empty
            if (stack.isEmpty()) {
                stack.push(new Pair(ch, 1));
            }

            // Same character as top
            else if (stack.peek().ch == ch) {
                stack.peek().count++;
            }

            // Different character
            else {
                stack.push(new Pair(ch, 1));
            }

            // If count becomes k, remove it
            if (stack.peek().count == k) {
                stack.pop();
            }
        }

        // Build answer from stack
        StringBuilder ans = new StringBuilder();

        for (Pair p : stack) {
            for (int i = 0; i < p.count; i++) {
                ans.append(p.ch);
            }
        }

        return ans.toString();
    }
    }
