class Solution {
    int dp[][]=new int[200][20000];
    public boolean fun(int arr[],int i, int sum,int tar){
        if(i>=arr.length || sum>tar) return false;
        else if(sum==tar) return true;
        if(dp[i][sum]!=-1){
            if(dp[i][sum]==1) return true;
            else return false;
        }
        boolean take=fun(arr,i+1,sum+arr[i],tar);
        boolean nt=fun(arr,i+1,sum,tar);
        if(take||nt)dp[i][sum]=1;
        else dp[i][sum]=-5;
        return take||nt; 
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        if(sum%2!=0) return false;
        return fun(nums,0,0,sum/2);
    }
}