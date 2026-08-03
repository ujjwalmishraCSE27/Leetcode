class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0,ans=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
           int rd = (sum % k + k) % k;
           //int rd=sum%k;
           if(map.containsKey(rd))
              ans+=map.get(rd);
           map.put(rd,map.getOrDefault(rd,0)+1);
        }
        return ans;


        
    }
}