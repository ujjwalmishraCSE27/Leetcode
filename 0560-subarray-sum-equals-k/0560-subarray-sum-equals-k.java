class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int psum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            psum+=nums[i];
            int n=psum-k;
            if(map.containsKey(n)){
                ans+=map.get(n);
            }
            map.put(psum,map.getOrDefault(psum,0)+1);
        }
        
        return ans;
    }
}