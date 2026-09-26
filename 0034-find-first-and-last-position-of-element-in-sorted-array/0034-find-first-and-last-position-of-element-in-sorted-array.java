class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        res[0]=findFirst(nums,target);
        res[1]=findLast(nums,target);
        return res;
    }
    public int findFirst(int[] nums, int target){
        int low=0,high=nums.length-1,idx=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            if(nums[mid]==target){
                idx=mid;
            }
        }
        return idx;
    }
    public int findLast(int[] nums, int target){
        int low=0,high=nums.length-1,idx=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<=target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            if(nums[mid]==target){
                idx=mid;
            }
        }
        return idx;
    }
}