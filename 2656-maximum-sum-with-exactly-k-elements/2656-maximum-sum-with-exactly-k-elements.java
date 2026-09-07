class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int score=0;
        while(k>0){

             score+=nums[nums.length-1];
             nums[nums.length-1]=nums[nums.length-1]+1;
             k--;
        }
        return score;
    }
}