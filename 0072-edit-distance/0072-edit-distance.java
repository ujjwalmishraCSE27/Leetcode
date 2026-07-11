class Solution {
    int dp[][]=new int[501][501];
    public int solve(int i,int j,String w1,String w2){
        if(i>=w1.length()){
            return w2.length()-j;
        } 
        if(j>=w2.length()) {
            return w1.length()-i;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(w1.charAt(i)==w2.charAt(j)){
            return dp[i][j]=solve(i+1,j+1,w1,w2);
        }
        int ins=1+solve(i,j+1,w1,w2);
        int rep=1+solve(i+1,j+1,w1,w2);
        int del=1+solve(i+1,j,w1,w2);
        return dp[i][j]=Math.min(ins,Math.min(rep,del));
    }
    public int minDistance(String word1, String word2) {
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        return solve(0,0,word1,word2);
    }
}