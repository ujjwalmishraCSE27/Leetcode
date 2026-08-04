class Solution {
    public int maxProduct(int[] nums) {
        int pre[]=new int[nums.length];
        int suff[]=new int[nums.length];
        int ans=nums[0];
        suff[nums.length-1]=nums[nums.length-1];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(pre[i-1]==0)
             pre[i]=nums[i];
            else
             pre[i]=pre[i-1]*nums[i];
        }
        for(int i=nums.length-2;i>=0;i--){
            if(suff[i+1]==0)
             suff[i]=nums[i];
            else
             suff[i]=suff[i+1]*nums[i];
        }
        for(int i=0;i<nums.length;i++){
            ans=Math.max(ans,Math.max(pre[i],suff[i]));
        }
        return ans;
    }
}