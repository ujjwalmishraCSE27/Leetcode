class Solution {
    int dp[][]=new int[201][201];
    public int solve(int i,int j,int a[][]){
        //if(i>=a.length || j>=a[0].length) return 0;
        if(i==a.length-1 && j==a[0].length-1)
             return a[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        int down=Integer.MAX_VALUE;
        int right=Integer.MAX_VALUE;
        if(i+1<a.length)
         down=a[i][j]+solve(i+1,j,a);
        if(j+1<a[0].length)
         right=a[i][j]+solve(i,j+1,a);
        return dp[i][j]=Math.min(down,right);
    }
    public int minPathSum(int[][] grid) {
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        return solve(0,0,grid);
    }
}