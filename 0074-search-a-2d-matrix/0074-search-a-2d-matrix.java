class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rl=matrix.length,cl=matrix[0].length;
        int low=0,high=(rl*cl)-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(matrix[mid/cl][mid%cl]==target){
                return true;
            }
            else if(matrix[mid/cl][mid%cl]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}