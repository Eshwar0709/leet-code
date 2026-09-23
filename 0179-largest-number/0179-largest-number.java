class Solution {
    public String largestNumber(int[] nums) {
        String[] strnum=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            strnum[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(strnum,(a,b)->(b+a).compareTo(a+b));
        if(strnum[0].equals("0")){
            return "0";
        }
        String res="";
        for(String x:strnum){
            res+=x;
        }
        return res;
    }
}