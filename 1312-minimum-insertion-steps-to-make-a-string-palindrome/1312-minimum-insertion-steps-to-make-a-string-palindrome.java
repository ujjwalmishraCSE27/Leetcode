class Solution {
    
    public int check(String s1,String s2){
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp.length;j++){
                if(i==0 || j==0) dp[i][j]=i+j;
                else if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[s1.length()][s2.length()];
    }
    public int minInsertions(String s) {
        StringBuilder str=new StringBuilder(s);
        String s2=str.reverse().toString();
        int ans=check(s,s2);
        return s.length()-ans;
    }
}