class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        int idx = 0;

        for (int i = 0; i < nums1.length; i++) {
            res[idx] = nums1[i];
            idx++;
        }

        for (int i = 0; i < nums2.length; i++) {
            res[idx] = nums2[i];
            idx++;
        }

        Arrays.sort(res);

        int n = res.length;
        if (n % 2 != 0) {
            return (double) res[n / 2];
        } else {
            int i = n / 2;
            int y = i - 1;
            return ((double) res[i] + (double) res[y]) / 2.0;
        }
    }
}