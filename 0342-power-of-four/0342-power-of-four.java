class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        long sum=1;
        return helper(n,sum);
    }
    boolean helper(int n,long sum){
        if(sum>n){
            return false;
        }
        if(sum==n){
            return true;
        }
        return helper(n,sum*4);
    }
}