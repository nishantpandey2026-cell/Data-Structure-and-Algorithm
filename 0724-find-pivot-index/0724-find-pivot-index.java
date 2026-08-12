class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        for(int  num :nums)
        {
            totalSum+=num;
        }
        int lsum=0;
        for(int i=0;i<nums.length;i++)
        {
            int rsum=totalSum-lsum-nums[i];
            if(lsum==rsum)
            {
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
    }
}