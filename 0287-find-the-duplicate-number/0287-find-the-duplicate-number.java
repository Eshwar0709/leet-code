class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length+1;
        int i=0;
        while(i<nums.length){
            if(nums[i]==i+1) i++;
            else{
                int idx=nums[i]-1;
                if(nums[idx]==nums[i]){
                    return nums[i];
                }
                int temp=nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;
            }
        }
        return -1;
    }
}