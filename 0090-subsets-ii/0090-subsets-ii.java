class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        subset(new ArrayList<>(), nums, 0,result);
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
        while(idx+1 < nums.length && nums[idx]==nums[idx+1]){
            idx++;
        }
        subset(ans, nums, idx+1, result);
    }
}