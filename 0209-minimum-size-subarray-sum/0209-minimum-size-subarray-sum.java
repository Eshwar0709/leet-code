class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,minLen=Integer.MAX_VALUE;
        int sum=0;
        for(j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=target){
                minLen=Math.min(minLen,j-i+1);
                sum-=nums[i];
                i++;
            }

        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}