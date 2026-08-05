class Solution {
    int dp[][]=new int[101][101];
    public int solve(int arr[][],int i,int j){
        if(i>=arr.length || j>=arr[0].length) return 0;
        if(i==arr.length-1 && j==arr[0].length-1) return 1;
        if(arr[i][j]==1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=solve(arr,i+1,j)+solve(arr,i,j+1);
    }
    public int uniquePathsWithObstacles(int[][] arr) {
        if(arr[arr.length-1][arr[0].length-1]==1) return 0;
        for(int n[]:dp){
            Arrays.fill(n,-1);
        }
        return solve(arr,0,0);
    }
}