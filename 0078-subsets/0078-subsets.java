class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        subset(ans, nums, 0,result);
        return result;
    }
    public void subset(List<Integer> ans, int[] nums, int idx, List<List<Integer>> result){
        if(idx==nums.length){
            result.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[idx]);
        subset(ans, nums, idx+1, result);
        ans.remove(ans.size()-1); 
        subset(ans, nums, idx+1, result);
    }
}