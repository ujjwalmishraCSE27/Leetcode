class Solution {
    public boolean check(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
               return false;
            i++;
            j--;
        }
        return true;
    }
    public void solve(String s,int idx,List<String>t,List<List<String>>ans){
        if(idx>=s.length()){
            ans.add(new ArrayList<>(t));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(check(s,idx,i)){
                t.add(s.substring(idx,i+1));
                solve(s,i+1,t,ans);
                t.remove(t.size()-1);
            }
        }

    }
    public List<List<String>> partition(String s) {
        List<List<String>>l=new ArrayList<>();
        solve(s,0,new ArrayList<>(),l);
        return l;
    }
}