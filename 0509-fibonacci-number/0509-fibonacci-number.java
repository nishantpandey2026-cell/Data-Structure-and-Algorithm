class Solution {
    public int fib(int n) {
       int ans=fibo(n);
       return ans;
    }
    public int fibo(int n){
        if(n==1)
        {
            return 1;
        }
        if(n==0){
            return 0;
        }
        return fib(n-1)+fib(n-2);
    }

}