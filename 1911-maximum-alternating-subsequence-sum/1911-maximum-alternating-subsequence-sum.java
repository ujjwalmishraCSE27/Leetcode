class Solution {
    long dp[][];
    public long solve(int arr[],int i,boolean flag){
        if(i>=arr.length) return 0;
        int val=0;
        int var=0;
        if(flag)var=1;
        if(flag) val=arr[i];
        else val=-arr[i];
        if(dp[i][var]!=-1) return dp[i][var];
        long take=val+solve(arr,i+1,!flag);
        long nt=solve(arr,i+1,flag);
        return dp[i][var]=Math.max(take,nt);
    }
    public long maxAlternatingSum(int[] nums) {
          dp=new long[nums.length][2];
          for(long a[]:dp){
            Arrays.fill(a,-1);
          }
          return solve(nums,0,true);
    }
}