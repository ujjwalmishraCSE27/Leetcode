class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int psum[]=new int[nums.length];
        psum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            psum[i]=psum[i-1]+nums[i];
        }
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            
            int tar=psum[i]-k;
            if(map.containsKey(tar))
                ans+=map.get(tar);
            map.put(psum[i],map.getOrDefault(psum[i],0)+1);
        }
        return ans;
    }
}