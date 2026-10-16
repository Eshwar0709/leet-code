class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result=new ArrayList<>();
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
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1) result.add(i+1);
        }
        return result;
    }
}