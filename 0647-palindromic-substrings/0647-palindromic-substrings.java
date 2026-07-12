class Solution {
    int dp[][]=new int[1001][1001];
    public boolean check(int i,int j, String st){
        if(i>=j) return true;
        if(dp[i][j]!=-1){
            return dp[i][j]==1;
        }
        if(st.charAt(i)==st.charAt(j) && check(i+1,j-1,st)){
           dp[i][j]=1;
           return true;
        }
        dp[i][j]=0;
        return false;
    }
    public int countSubstrings(String s) {
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        int ans=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
               if(check(i,j,s))
                  ans++;
            }
        }
        return ans;
    }
}