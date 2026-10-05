class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0; 
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int result = 0;
        for (int i : map.keySet()) {
            if (k > 0 && map.containsKey(i + k)) {
                result++;
            } else if (k == 0 && map.get(i) > 1) {
                result++;
            }
        }
        
        return result;
    }
}