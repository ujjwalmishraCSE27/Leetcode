class Solution {
    int dp[][]=new int[101][101];
    public int solve(int i,int j,int m,int n){
        if(i<0 || i>m || j<0 || j>n) return 0;
        if(i==m-1 && j==n-1) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int right=solve(i,j+1,m,n);
        int down=solve(i+1,j,m,n);
        return dp[i][j]=right+down;
    }
    public int uniquePaths(int m, int n) {
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        return solve(0,0,m,n);
    }
}