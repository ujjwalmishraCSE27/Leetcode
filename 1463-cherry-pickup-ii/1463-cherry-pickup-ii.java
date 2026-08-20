class Solution {
    int dp[][][][]=new int[71][71][71][71];
    public int solve(int arr[][],int i,int j,int x, int y){
        if(i>=arr.length || j>=arr[0].length || x<0 || y<0 || x>=arr.length || y>=arr[0].length || i<0 || j<0) return Integer.MIN_VALUE/2;
        int che=0;
        if(i == arr.length-1) {
                if(j == y) return arr[i][j];
              return arr[i][j] + arr[x][y];
         }
         if(dp[i][j][x][y]!=-1) return dp[i][j][x][y];
        if(i==x && j==y) che+=arr[i][j];
        else che+=arr[i][j]+arr[x][y];
        int a = solve(arr, i+1, j-1, x+1, y-1);
        int b = solve(arr, i+1, j-1, x+1, y);
        int c = solve(arr, i+1, j-1, x+1, y+1);

        int d = solve(arr, i+1, j, x+1, y-1);
        int e = solve(arr, i+1, j, x+1, y);
        int f = solve(arr, i+1, j, x+1, y+1);

        int g = solve(arr, i+1, j+1, x+1, y-1);
        int h = solve(arr, i+1, j+1, x+1, y);
        int k = solve(arr, i+1, j+1, x+1, y+1);

        int maxi1=Math.max(a,Math.max(b,Math.max(c,d)));
        int maxi2=Math.max(e,Math.max(f,Math.max(g,h)));
        int maxi3=Math.max(maxi1,Math.max(maxi2,k));
        return dp[i][j][x][y]=che+maxi3;
        
    }
    public int cherryPickup(int[][] grid) {
        for(int a[][][]:dp){
            for(int b[][]:a){
                for(int c[]:b){
                    Arrays.fill(c,-1);
                }
            }
        }
        return Math.max(solve(grid,0,0,0,grid[0].length-1),0);
    }
}