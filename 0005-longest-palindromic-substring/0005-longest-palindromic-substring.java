class Solution {
    public boolean check(String s,int st,int e){
        while(st<=e){
            if(s.charAt(st)!=s.charAt(e))
               return false;
            st++;
            e--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int ans=0;
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