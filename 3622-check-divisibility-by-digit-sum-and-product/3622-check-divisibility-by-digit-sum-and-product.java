class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,prod=1,num=n;
        while(n>0){
            int r=n%10;
            sum+=r;
            prod*=r;
            n/=10;
        }
        if(num%(sum+prod)==0)return true;
        else return false;
    }
}