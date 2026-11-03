class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int max=nums[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            int temp=max-nums[i];
            ans=ans+temp;

        }
        return ans;
    }
}