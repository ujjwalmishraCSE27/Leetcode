class Solution {
    int ans=Integer.MAX_VALUE;
    //int dp[]=new int[9];
    public void solve(int nums[],int[]arr,int i){
        if(i>=nums.length){
            int max=Integer.MIN_VALUE;
            for(int x:arr){
                max=Math.max(max,x);
            }
            ans=Math.min(ans,max);
            //dp[i]=ans;
            return;
        }
        //if(dp[i]!=-1) return dp[i];
        for(int idx=0;idx<arr.length;idx++){
            arr[idx]+=nums[i];
            solve(nums,arr,i+1);
            arr[idx]-=nums[i];
            //solve(nums,arr,i+1);
        }
    }
    public int distributeCookies(int[] cookies, int k) {
        int arr[]=new int[k];
        //Arrays.fill(dp,-1);
        solve(cookies,arr,0);
        return ans;
    }
}