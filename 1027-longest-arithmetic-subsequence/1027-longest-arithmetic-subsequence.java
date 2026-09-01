class Solution {
    int dp[][]=new int[1001][1003];
    public int solve(int arr[],int i,int d){
        int idx=500+d;
        if(dp[i][idx]!=Integer.MIN_VALUE) return dp[i][idx];
        if(i>=arr.length) return 0;
        for(int k=i-1;k>=0;k--){
            if(arr[i]-arr[k]==d)
               return dp[i][idx]=1+solve(arr,k,d);
        }
        return dp[i][idx]=0;
    }
    public int longestArithSeqLength(int[] nums) {
        int res=0;
        for(int a[]:dp){
            Arrays.fill(a,Integer.MIN_VALUE);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int d=nums[j]-nums[i];
                res=Math.max(res,2+solve(nums,i,d));
            }
        }
        return res;
    }
}