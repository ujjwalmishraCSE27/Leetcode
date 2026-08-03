class Solution {
    public int largestAltitude(int[] gain) {
        int[]arr=new int[gain.length];
        arr[0]=gain[0];
        int ans=arr[0];
        for(int i=1;i<gain.length;i++){
            arr[i]=arr[i-1]+gain[i];
            ans=Math.max(arr[i],ans);
        }
        if(ans<0) return 0;
        return ans;
    }
}