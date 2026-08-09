class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int ans=0;
        HashMap<Character,Integer>set=new HashMap<>();
        while(right<s.length())
        {
           set.put(s.charAt(right),set.getOrDefault(s.charAt(right),0)+1);
           while(set.get(s.charAt(right))>1)
           {
              set.put(s.charAt(left),set.getOrDefault(s.charAt(left),0)-1);
              if(set.get(s.charAt(left))==0)
              {
                 set.remove(s.charAt(left));
              }
              left+=1;
           }
           ans=Math.max(ans,right-left+1);
           right+=1;

        }
        return ans;
    }
}