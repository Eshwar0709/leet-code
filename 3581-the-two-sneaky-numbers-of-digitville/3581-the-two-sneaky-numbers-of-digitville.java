class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr=new int[101];
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1){
                res[k++]=i;
            }
        }
        return res;
    }
}