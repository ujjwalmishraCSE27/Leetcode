class Solution {
    public String longestPalindrome(String s) {
        int ans=-1,maxL=0;
        int n=s.length();
        int len=0;
        if(n==1 || s.equals("")) return s;
        StringBuilder sb=new StringBuilder();
        int dp[][]=new int[n+1][n+1];
        for(int l=1;l<=s.length();l++){
            for(int i=0;i+l-1<n;i++){
                 int j=i+l-1;
                 if(l==1){
                    dp[i][j]=1;
                    if(l>len){
                        sb.setLength(0);
                        sb.append(s,i,j+1);
                        len=l;
                    }
                 }
                 if(l==2 && s.charAt(i)==s.charAt(j)){
                    dp[i][j]=1;
                    if(l>len){
                        sb.setLength(0);
                        sb.append(s,i,j+1);
                        len=l;
                    }
                 }
                 if(l>=3){
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==1)
                     { dp[i][j]=1;
                       if(l>len){
                        sb.setLength(0);
                        sb.append(s,i,j+1);
                        len=l;
                    }
                }  
                 }
            }
        }
        return sb.toString();
        
    }
}