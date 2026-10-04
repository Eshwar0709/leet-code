class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n=intervals.length;
        int[] arr= new int[n];
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=intervals[i][0];
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],i);
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int val=binarySearch(arr,intervals[i][1]);
            if(val==-1){
                ans[i]=-1;
            }
            else{
                ans[i]=map.get(arr[val]);
            }
        }
        return ans;
    }
    public int binarySearch(int[] arr,int target){
        int low=0,high=arr.length-1,ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
}