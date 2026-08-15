class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int dp[]=new int[n];
        int idx[]=new int[n];
        Arrays.fill(dp,1);
        Arrays.fill(idx,-1);
        int id=0,maxi=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0){
                    if(dp[i]<dp[j]+1){
                        dp[i]=dp[j]+1;
                        idx[i]=j;
                    }
                }
            }
            if(dp[i]>maxi){
                maxi=dp[i];
                id=i;
            }
        }
        List<Integer>l=new ArrayList<>();
        for(int i=id;i>=0;i=idx[i]){
            l.add(nums[i]);
        }
        return l;
    }
}