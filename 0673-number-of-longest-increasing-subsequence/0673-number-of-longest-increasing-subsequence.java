class Solution {
    public int findNumberOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        int cnt[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            cnt[i]=1;
            dp[i]=1;
        }
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(dp[j]+1>dp[i]) cnt[i]=cnt[j];
                    else if(dp[i]==dp[j]+1)cnt[i]+=cnt[j];
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
                
            }
        }
        int maxi=0;
        for(int i=0;i<dp.length;i++){
            maxi=Math.max(dp[i],maxi);
        }
        int ans=0;
        for(int i=0;i<cnt.length;i++){
           if(dp[i]==maxi) ans+=cnt[i];
        }
        return ans;

    }
}