class Solution {
    public int findKthPositive(int[] arr, int k) {
        int j=0,cnt=0,ans=1;
        for(int i=1;i<=arr.length+k;i++){
            if(j>=arr.length || arr[j]!=i){
                cnt++;
                if(cnt==k){
                    ans=i;
                    break;
                }
            }
            else j++;
        }
        return ans;
    }
}