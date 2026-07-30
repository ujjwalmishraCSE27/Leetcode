class Solution {
    public boolean solve(int arr[],int maxop,int mid){
        long op=0;
        for(int i=0;i<arr.length;i++){
            op+=arr[i]/mid;
            if(arr[i]%mid==0) op--;
        }
        return op<=maxop;
    }
    public int minimumSize(int[] nums, int maxop) {
        int l=1,h=0,ans=0;
        for(int n:nums){
            h=Math.max(h,n);
        }
        while(l<=h){
            int mid=l+(h-l)/2;
            if(solve(nums,maxop,mid)){
                h=mid-1;
                ans=mid;
            }
            else l=mid+1;
        }
        return ans;
    }
}