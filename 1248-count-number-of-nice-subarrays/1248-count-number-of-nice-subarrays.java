class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0)
               arr[i]=1;
            else arr[i]=-1;
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        int psum=0;
        int ans=0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1)
             psum+=arr[i];
            int tar=psum-k;
            if(map.containsKey(tar))
               ans+=map.get(tar);
            map.put(psum,map.getOrDefault(psum,0)+1);
        }
        return ans;
    }
}