class Solution {
    public int maxArea(int[] height) {
        int low=0,high=height.length-1;
        int result=Integer.MIN_VALUE;
        while(low<=high){
            int currarea=Math.min(height[low],height[high])*(high-low);
            result=Math.max(currarea,result);
            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return result;
    }
}