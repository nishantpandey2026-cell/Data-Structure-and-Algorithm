class Solution {
    public int findMin(int a, int b) {
        // code here
        int sum=a+b;
        int prod=a*b;
        int sub=a-b;
        int div=Integer.MAX_VALUE;
        try{
            div=a/b;
        }
        catch(Exception e){
             div=Integer.MAX_VALUE;
        }
       if(sum<prod && sum<sub && sum<div){
           return sum;
       }
       else if(sum>prod && prod<sub && prod<div){
           return prod;
       }
      else if(sub<prod && sub<sum && sub<div){
           return sub;
       }
       else
       {
           return div;
       }
    }
}