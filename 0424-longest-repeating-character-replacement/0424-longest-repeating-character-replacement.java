class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int right=0;
        int ans=0;
        int maxFreq=0;
        HashMap<Character,Integer>set=new HashMap<>();
        while(right<s.length())
        {
            char Rchar=s.charAt(right);
            set.put(s.charAt(right),set.getOrDefault(s.charAt(right),0)+1);
            maxFreq=Math.max(maxFreq,set.get(Rchar));
            while((right-left+1)-maxFreq>k)
            {
                char Lchar=s.charAt(left);
               set.put(Lchar,set.get(Lchar)-1);
               left+=1;
            }
            ans=Math.max(ans,right-left+1);
            right+=1;
        }
        return ans;
    
    }
}