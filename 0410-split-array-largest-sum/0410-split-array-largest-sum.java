class Solution {
    public boolean possible(int arr[],int k,int mid){
        int sum=0,sub=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+sum>mid){
                sub++;
                sum=arr[i];
            }
            else
              sum+=arr[i];
        }
        return sub<=k;
    }
    public int splitArray(int[] nums, int k) {
        int l=1,h=0,ans=0;
        for(int n:nums){
            h+=n;
            l=Math.max(l,n);
        }
        while(l<=h){
            int mid=l+(h-l)/2;
            if(possible(nums,k,mid)){
            ans=mid;
            h=mid-1;

            }
            else l=mid+1;
        }
        return ans;
    }
}