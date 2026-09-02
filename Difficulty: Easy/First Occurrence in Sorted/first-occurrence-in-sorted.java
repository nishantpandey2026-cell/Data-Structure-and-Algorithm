class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int left=0;
        int right=arr.length-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==k){
                ans = mid;       // possible first occurrence
                           right = mid - 1;
            }
            else if(arr[mid]<k){
                left=mid+1;
            }
            else if(arr[mid]>k)
            {
                right=mid-1;
            }
        }
        return ans;
    }
}