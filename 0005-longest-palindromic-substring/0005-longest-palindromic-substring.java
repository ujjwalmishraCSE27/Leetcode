class Solution {
    int dp[][]=new int[1001][1001];
    public boolean check(String s,int st,int e){
      if(st>=e) return true;
      if(dp[st][e]!=-1){
        if(dp[st][e]==0) return false;
        else return true;
      }
      if(s.charAt(st)==s.charAt(e) && check(s,st+1,e-1)){
         dp[st][e]=1;
         return true;
      }
      dp[st][e]=0;
      return false;
    }
    public String longestPalindrome(String s) {
        int ans=0;
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(check(s,i,j)){
                    if(j-i+1>ans){
                        sb.setLength(0);
                        sb.append(s,i,j+1);
                        ans=j-i+1;
                    }

                }
            }
        }
        return sb.toString();
    }
}