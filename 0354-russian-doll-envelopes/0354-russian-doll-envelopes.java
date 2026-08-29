import java.util.Arrays;

class Solution {
    public int maxEnvelopes(int[][] env) {
        if (env == null || env.length == 0) return 0;
        Arrays.sort(env, (a, b) -> {
            if (a[0] == b[0]) return Integer.compare(b[1], a[1]);
            return Integer.compare(a[0], b[0]);
        });
        int[] dp = new int[env.length];
        int len = 0;
        for (int[] envelope : env) {
            int height = envelope[1];
            int idx = Arrays.binarySearch(dp, 0, len, height);
            if (idx < 0) {
                idx = -(idx + 1);
            }
            dp[idx] = height;
            if (idx == len) {
                len++;
            }
        }
        return len;
    }
}