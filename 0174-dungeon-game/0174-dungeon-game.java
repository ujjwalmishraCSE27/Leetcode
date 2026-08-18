class Solution {
    public int calculateMinimumHP(int[][]arr) {
        int n=arr.length;
        int m=arr[0].length;
        int dp[][]=new int[arr.length][arr[0].length];
        
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(i==n-1 && j==m-1) 
                {if(arr[i][j]<=0) dp[n-1][m-1]=Math.abs(arr[n-1][m-1])+1;
                    else dp[n-1][m-1]=1;
                    continue;
                }
                int res=0;
                int down=Integer.MAX_VALUE/2;
                int right=Integer.MAX_VALUE/2;
                if(j==m-1 && i!=n-1){
                    down=dp[i+1][j];
                }
                else if(i==n-1 && j!=m-1){
                    right=dp[i][j+1];
                }
                else if(i!=n-1 && j!=m-1){
                    down=down=dp[i+1][j];
                    right=right=dp[i][j+1];
                }
                res=Math.min(down,right)-arr[i][j];
                if(res<=0) dp[i][j]=1;
                else dp[i][j]=res;
            }
        }
        return dp[0][0];
    }
}