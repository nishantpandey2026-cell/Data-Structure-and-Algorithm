class Solution {
    public boolean isPowerOfThree(int n) {
        long sum=1;
        if(n==1){
            return true;
        }
        return helper(n,sum);
    }
    boolean helper(int n,long sum){
        if(sum>n){
            return false;
        }
        if(sum==n){
            return true;
        }
        return helper(n,sum*3);
    }
}