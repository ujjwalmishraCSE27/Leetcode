class Solution {
    public int countSubstrings(String s) {
        boolean dp[][]=new boolean[s.length()+1][s.length()+1];
        for(int l=1;l<=s.length();l++){
            for(int i=0;i+l-1<s.length();i++){
                int j=i+l-1;
                if(i==j)dp[i][j]=true;
                else if(i+1==j){
                    if(s.charAt(i)==s.charAt(j)) dp[i][j]=true;
                    else dp[i][j]=false;
                }
                else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]) dp[i][j]=true;
                    else dp[i][j]=false;
                }
            }
        }
        int cnt=0;
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp.length;j++){
                if(dp[i][j]) cnt++;
            }
        }
        return cnt;
    }
}