class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(0, nums, result);
        return result;
    }
    public void helper(int start, int[] nums, List<List<Integer>> result) {
        if (start == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) permutation.add(num);
            result.add(permutation);
            return;
        }
        for (int i = start; i < nums.length; i++) {
            
            int temp=nums[i];
            nums[i]=nums[start];
            nums[start]=temp;

            helper(start + 1, nums, result);

            temp=nums[i];
            nums[i]=nums[start];
            nums[start]=temp;
        }
    }
}
