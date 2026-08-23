class Solution {
    public void reverseString(char[] s) {
        Stack<Character>reverse=new Stack<>();
        for(int i=0;i<s.length;i++)
        {
            reverse.push(s[i]);
        }
        for(int i=0;i<s.length;i++)
        {
            s[i]=reverse.pop();
        }
    }
}