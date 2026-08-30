class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1) return 1;
        int mini=-1,min=Integer.MAX_VALUE,maxi=-1,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max)
            {
                max=nums[i];
                maxi=i;
            }
            if(nums[i]<min){
                min=nums[i];
                mini=i;
            }
        }
        if(mini==maxi){
            return Math.min(maxi+1,nums.length-maxi);
        }
        int left=Math.max(mini,maxi)+1;
        int right=nums.length-Math.min(maxi,mini);
        int both=Math.min(mini+1,nums.length-mini)+Math.min(maxi+1,nums.length-maxi);
        return Math.min(left,Math.min(right,both));
    }
}