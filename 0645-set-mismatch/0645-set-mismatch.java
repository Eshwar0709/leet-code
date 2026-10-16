class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result=new int[2];
        int n=nums.length;
        int i=0;
        while(i<n){
            int idx=nums[i]-1;
            if(nums[i]==i+1 || nums[i]==nums[idx]) i++;
            else{
                int temp=nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;
            }
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1){
                result[0]=nums[i];
                result[1]=i+1;
            }
        }
        return result;
    }
}