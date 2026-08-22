class Solution {
    public int[] twoSum(int[] nums, int tar) {
        int ans[]=new int[2];
        int i=0,j=nums.length-1;
        while(i<nums.length && j>=0){
            if(nums[i]+nums[j]==tar){
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }
            if(nums[i]+nums[j]>tar)j--;
            else i++;
        }
        return ans;
    }
}