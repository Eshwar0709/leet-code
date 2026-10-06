class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int target=2*arr[i];
            int index=binarySearch(arr,target);
            if(index>=0 && index!=i){
                return true;
            }
        }
        return false;
    }
    public int binarySearch(int[] arr,int target){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}