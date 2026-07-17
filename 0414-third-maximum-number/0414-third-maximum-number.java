class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        // if(nums.length<3)
        //    return nums[nums.length-1];
        int dis=1;
        for(int i=nums.length-1;i>=1;i--){
            if(nums[i]!=nums[i-1]) dis++;
            if(dis==3) return nums[i-1];
        }
        return nums[nums.length-1];
    }
}