class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            hm.put(nums1[i],hm.getOrDefault(nums1[i],0) + 1);
        }
        for(int i=0; i < nums2.length; i++){
            if(hm.containsKey(nums2[i]) && hm.get(nums2[i]) > 0){
                result.add(nums2[i]);
                hm.put(nums2[i],hm.get(nums2[i])-1);
            }
        }
        int[] res=new int[result.size()];
        int k=0;
        for(int num: result){
            res[k++] = num;
        }
        return res;
    }
}