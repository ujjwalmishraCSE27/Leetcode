class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer>l=new ArrayList<>();
        int idx=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                
                l.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j])j++;
            else i++;
        }
        int ans[]=new int[l.size()];
        for(int k=0;k<l.size();k++){
            ans[k]=l.get(k);
        }
        return ans;
    }
}