class Solution {
    public boolean check(int s,int e, String st){
        while(s<=e){
            if(st.charAt(s)!=st.charAt(e))
               return false;
            s++;
            e--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int ans=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
               sb.append(s.charAt(j));
               String str=sb.toString();
               if(check(0,str.length()-1,str))
                  ans++;
            }
            sb.setLength(0);
        }
        return ans;
    }
}