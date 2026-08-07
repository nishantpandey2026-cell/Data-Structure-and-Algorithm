class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int ans=Integer.MAX_VALUE;
        int sum=0;
        while(right<nums.length)
        {
            sum+=nums[right];
            if(sum<target)
            {
                right++;
            }
            else
            {
                ans=Math.min(ans,(right-left+1));
                while(sum>=target && left<=right)
                {
                    sum-=nums[left];
                    ans=Math.min(ans,(right-left+1));
                    left++;
                }
                right+=1;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}