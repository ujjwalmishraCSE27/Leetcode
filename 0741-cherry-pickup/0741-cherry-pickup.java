class Solution {
    int dp[][][][]=new int [51][51][51][51];
    public int solve(int arr[][],int i,int j,int x, int y){
        if(i>=arr.length || j>=arr[0].length || x>=arr.length || y>=arr[0].length || arr[i][j]==-1 || arr[x][y]==-1) return Integer.MIN_VALUE/2;
        int che=0;
        if(dp[i][j][x][y]!=-1) return dp[i][j][x][y];
        if(i==arr.length-1 && j==arr[0].length-1) return arr[i][j];
        //if(x==arr.length-1 && y==arr[0].length-1) return arr[x][y];
        if(i==x && j==y){
           che+=arr[i][j];
        }
        else che+=arr[i][j]+arr[x][y];
        int a=solve(arr,i+1,j,x+1,y);
        int b=solve(arr,i,j+1,x,y+1);
        int c=solve(arr,i+1,j,x,y+1);
        int d=solve(arr,i,j+1,x+1,y);
        che=che+Math.max(a,Math.max(b,Math.max(c,d)));
        return dp[i][j][x][y]=che;
    }
    public int cherryPickup(int[][] grid) {
        for(int a[][][]:dp){
            for(int b[][]:a){
               for(int c[]:b)
                Arrays.fill(c,-1);
            }
        }
        return Math.max(0,solve(grid,0,0,0,0));
    }
}