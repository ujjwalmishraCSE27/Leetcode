class Solution {
    public void solve(List<List<Integer>> l, int i, boolean vis[]){
        vis[i]=true;
        for(int j=0;j<l.get(i).size();j++){
            int neighb=l.get(i).get(j);
            if(!vis[neighb])
               solve(l,neighb,vis);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean vis[]=new boolean[n];
        solve(rooms,0,vis);
        for(int i=0;i<vis.length;i++){
            if(!vis[i]) return false;
        }
        return true;
    }
}