class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod=(int)1e9+7;
        int p[]=new int[arr.length];
        p[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            p[i]=p[i-1]+arr[i];
        }
        int even=1,ans=0,odd=0;
        for(int i=0;i<arr.length;i++){
            if(p[i]%2==0){
                ans=(ans+odd)%mod;
                even++;
            }
            else {
                ans=(ans+even)%mod;
                odd++;
            }
        }
        return ans;
    }
}