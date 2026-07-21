class Solution {
    int[] dp;
    boolean[][] pal;

    public int solve(String s, int idx) {
        if (idx == s.length())
            return -1;

        if (dp[idx] != -1)
            return dp[idx];

        int ans = Integer.MAX_VALUE;

        for (int i = idx; i < s.length(); i++) {
            if (pal[idx][i]) {
                ans = Math.min(ans, 1 + solve(s, i + 1));
            }
        }

        return dp[idx] = ans;
    }

    public int minCut(String s) {
        int n = s.length();

        dp = new int[n];
        Arrays.fill(dp, -1);

        pal = new boolean[n][n];
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;

                if (len == 1)
                    pal[i][j] = true;
                else if (len == 2)
                    pal[i][j] = (s.charAt(i) == s.charAt(j));
                else
                    pal[i][j] = (s.charAt(i) == s.charAt(j)) && pal[i + 1][j - 1];
            }
        }

        return solve(s, 0);
    }
}