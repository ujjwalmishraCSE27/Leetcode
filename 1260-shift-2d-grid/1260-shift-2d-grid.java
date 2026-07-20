class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                arr.add(grid[i][j]);
            }
        }
        while(k!=0){
            int n=arr.remove(arr.size()-1);
            arr.add(0,n);
            k--;
        }
        List<List<Integer>> res=new ArrayList<>();
         int y=0;
        for(int i=0;i<grid.length;i++){
            ArrayList<Integer> koo=new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                koo.add(arr.get(y));
                y++;
            }
            res.add(koo);
        }
        return res;
    }
}