class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        //if(s.length()==1 && t.length()==1 && s.charAt(0)!=t.charAt(0)) return false;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else j++;
        }
        return i==s.length();
    }
}