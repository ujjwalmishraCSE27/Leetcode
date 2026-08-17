class Solution {
    class pair {
        long min;
        long max;
        pair(long min, long max) {
            this.min = min;
            this.max = max;
        }
    }

    pair[][] memo;
    boolean[][] vis;
    long mod = 1000000007L;

    public pair solve(int[][] a, int i, int j) {
        if (i == a.length - 1 && j == a[0].length - 1)
            return new pair(a[i][j], a[i][j]);

        if (memo[i][j]!=null)
            return memo[i][j];

        //vis[i][j] = true;

        long maxi = Long.MIN_VALUE;
        long mini = Long.MAX_VALUE;

        if (i + 1 < a.length && j<a[0].length) {
            pair down = solve(a, i + 1, j);

            long x = a[i][j] * down.max;
            long y = a[i][j] * down.min;

            maxi = Math.max(maxi, Math.max(x, y));
            mini = Math.min(mini, Math.min(x, y));
        }

        if (j + 1 < a[0].length && i<a.length) {
            pair right = solve(a, i, j + 1);

            long x = a[i][j] * right.max;
            long y = a[i][j] * right.min;

            maxi = Math.max(maxi, Math.max(x, y));
            mini = Math.min(mini, Math.min(x, y));
        }

        memo[i][j] = new pair(mini, maxi);
        return memo[i][j];
    }

    public int maxProductPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        memo = new pair[m][n];
        vis = new boolean[m][n];

        long ans = solve(grid, 0, 0).max;

        if (ans < 0)
            return -1;

        return (int)(ans % mod);
    }
}