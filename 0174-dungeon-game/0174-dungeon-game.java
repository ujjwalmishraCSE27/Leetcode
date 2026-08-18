class Solution {
    public int dp[][];
    public int solve(int arr[][],int i,int j){
        int res1=0,res=0;
        if(i==arr.length || j==arr[0].length){
            return Integer.MAX_VALUE/2;
        }
        if(i==arr.length-1 && j==arr[0].length-1){
            if(arr[i][j]<=0)
               return Math.abs(arr[i][j])+1;
            else return 1;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int down=solve(arr,i+1,j);
        int right=solve(arr,i,j+1);
        res=Math.min(down,right)-arr[i][j];
        if(res<=0) return dp[i][j]=1;
        else return dp[i][j]=res;
    }
    public int calculateMinimumHP(int[][]arr) {
        dp=new int[arr.length][arr[0].length];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        return solve(arr,0,0);
    }
}