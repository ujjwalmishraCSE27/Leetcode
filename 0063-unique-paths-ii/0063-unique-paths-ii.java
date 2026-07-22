class Solution {
    int dp[][]=new int[101][101];
    public int solve(int arr[][],int i,int j){
        if(i>=arr.length || j>=arr[0].length) return 0;
        if(arr[i][j]==1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(i==arr.length-1 && j==arr[0].length-1) return 1;
        int down=solve(arr,i+1,j);
        int right=solve(arr,i,j+1);
        return dp[i][j]=down+right;
    }
    public int uniquePathsWithObstacles(int[][] arr) {
           for(int a[]:dp){
            Arrays.fill(a,-1);
           }
           return solve(arr,0,0);
    }
}