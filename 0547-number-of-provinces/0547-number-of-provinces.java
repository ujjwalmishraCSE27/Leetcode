class Solution {
    public void dfs(int node,List<List<Integer>>l, int vis[]){
        vis[node]++;
        for(int i=0;i<l.get(node).size();i++){
            int nei=l.get(node).get(i);
            if(vis[nei]==0) dfs(nei,l,vis);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> l=new ArrayList<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++) l.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j)
                   l.get(i).add(j);
            }
        }
        int vis[]=new  int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                ans++;

                dfs(i,l,vis);
            }
        }
        return ans;
    }
}