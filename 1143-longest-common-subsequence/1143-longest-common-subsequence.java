class Solution {
    int dp[][]=new int[1001][1001];
    public int solve(int i,int j, String s1, String s2){
        if(i>=s1.length() || j>=s2.length()) return 0;
        int take=0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=1+solve(i+1,j+1,s1,s2);
        }
        else{
            take=solve(i+1,j,s1,s2);
        }
        int nt=solve(i,j+1,s1,s2);
        return dp[i][j]=Math.max(take,nt);
    }
    public int longestCommonSubsequence(String text1, String text2) {
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        return solve(0,0,text1,text2);
    }
}