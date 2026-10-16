class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0,n=nums.length;
        while(i<n){
            if(nums[i]<=0 || nums[i]>n || nums[i]==i+1 || nums[i]==nums[nums[i]-1]) i++;
            else{
                int idx=nums[i]-1;
                int temp=nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;
            }
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1) return i+1;
        }
        return n+1;
    }
}