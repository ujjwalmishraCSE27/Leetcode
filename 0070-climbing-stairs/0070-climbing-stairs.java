class Solution {
    int dp[]=new int[46];
    public int solve(int n,int i){
        if(i>n) return 0;
        else if(i==n) return 1;
        if(dp[i]!=-1) return dp[i];
        int a=solve(n,i+1);
        int b=solve(n,i+2);
        return dp[i]=a+b;
    }
    public int climbStairs(int n) {
        Arrays.fill(dp,-1);
        return solve(n,0);
    }
}