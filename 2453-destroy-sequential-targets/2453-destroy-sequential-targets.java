class Solution {
    public int destroyTargets(int[] nums, int space) {
        Map<Integer, Integer> counts = new HashMap<>();
        int maxCount = 0;

        for (int num : nums) {
            int rem = num % space;
            int count = counts.getOrDefault(rem, 0) + 1;
            counts.put(rem, count);
            maxCount = Math.max(maxCount, count);
        }

        int result = Integer.MAX_VALUE;
        for (int num : nums) {
            int rem = num % space;
            if (counts.get(rem) == maxCount) {
                result = Math.min(result, num);
            }
        }

        return result;
    }
}