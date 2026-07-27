class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int p=1,p1=1;
        int zero=0;
        for(int i:nums){
            if(i==0)zero++;
            p*=i;
            if(i==0) continue;
            p1*=i;
        }
        if(zero>=2) return ans;
        if(p!=p1 && zero==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0)
                    ans[i]=p1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
              ans[i]=p/nums[i];
        }
        return ans;
    }
}