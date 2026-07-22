class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
           int dp[][]=new int[arr.length][arr[0].length];
           for(int i=0;i<arr.length;i++){
              if(i==0) dp[i][0]=0;
              if(arr[i][0]==1) break;
              dp[i][0]=1;
           }
           for(int j=0;j<arr[0].length;j++){
              if(j==0) dp[0][j]=0;
              if(arr[0][j]==1) break;
              dp[0][j]=1;
           }
           for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                if(arr[i][j]==1) dp[i][j]=0;
                else dp[i][j]=dp[i-1][j]+dp[i][j-1];
                
            }
           }
           return dp[arr.length-1][arr[0].length-1];
    }
}