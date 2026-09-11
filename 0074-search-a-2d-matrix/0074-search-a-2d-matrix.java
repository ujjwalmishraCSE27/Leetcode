class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start=0,end=matrix.length*matrix[0].length-1;
        int n=matrix[0].length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(matrix[mid/n][mid%n]<target){
                start=mid+1;
            }
            else if(matrix[mid/n][mid%n]>target) end=mid-1;
            else return true;
        }
        return false;
    }
}