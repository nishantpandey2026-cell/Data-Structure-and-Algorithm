class Solution {
    public char kthCharacter(int k) {
        StringBuilder s = new StringBuilder("a");
        StringBuilder finalString = helper(k, s);
        return finalString.charAt(k - 1);
    }

    StringBuilder helper(int k, StringBuilder s) {
       
        if (s.length() >= k) {
            return s;
        }
        
        StringBuilder temp = new StringBuilder("");
         
        for (int i = 0; i < s.length(); i++) {
            char nextChar = s.charAt(i);
            
            
            if (nextChar == 'z') {
                nextChar = 'a';
            } else {
                nextChar++;  
            }
            temp.append(nextChar);
        }
        
        s.append(temp);
        
        
        return helper(k, s);
    }
}