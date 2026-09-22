class Solution {
    public int majorityElement(int[] nums) {
        int maxcount=1,maxcval=0;
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}