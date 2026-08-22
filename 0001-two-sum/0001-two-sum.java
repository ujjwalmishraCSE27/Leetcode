class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int ans[]=new int[2];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            int req=target-nums[i];
            if(map.containsKey(req))
           { 
              ans[0]=map.get(req);
              ans[1]=i;
              break;
           }
           map.put(nums[i],i);
        }
        return ans;
    }
}