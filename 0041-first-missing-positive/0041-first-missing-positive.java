import java.util.Arrays;
class Solution {
    public int firstMissingPositive(int[] nums) {
      Arrays.sort(nums);
      int t=1;
        for(int i:nums)
        {
            if(i>0 && i==t){
                    t++;
            }
        }
        return t;
    }
}