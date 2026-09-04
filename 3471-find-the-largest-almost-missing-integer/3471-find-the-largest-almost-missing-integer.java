class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<=nums.length-k;i++){
            HashSet<Integer>set=new HashSet<>();
            for(int j=i;j<i+k;j++){
                set.add(nums[j]);
            }
            for(int n:set){
                //int n=set.remove();
                map.put(n,map.getOrDefault(n,0)+1);
            }
        }
        int maxi=-1;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            
            if(entry.getValue()==1) maxi=Math.max(entry.getKey(),maxi);
        }
        return maxi;
    }
}