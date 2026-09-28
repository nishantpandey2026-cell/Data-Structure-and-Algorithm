class Solution {
    public int maxDepth(String s) {
        int bracketCount=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                bracketCount++;
            }
            else if(s.charAt(i)==')'){
                ans=Math.max(ans,bracketCount);
                bracketCount-=1;
            }
        }
        return ans;
    }

}