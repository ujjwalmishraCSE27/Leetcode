class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else i++;
        }
        int idx=0;
        int ans[]=new int[set.size()];
        Iterator<Integer>iterator=set.iterator();
        while(iterator.hasNext()){
            ans[idx]=iterator.next();
            idx++;
        }
        return ans;
    }
}