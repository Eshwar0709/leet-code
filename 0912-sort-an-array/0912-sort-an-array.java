class Solution {
    public static int[] merge(int[]a,int[]b){
        int[] c = new int[a.length+b.length];
        int i = 0,j = 0,k = 0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]) c[k++] = b[j++];
            else c[k++] = a[i++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
        return c;
    }
    public static int[] MergeSort(int []nums,int start,int end){
        int mid = (start+end)/2;
        if(start>=end){
            return new int[]{nums[start]};
        }
        int arr1[] = MergeSort(nums,start,mid);
        int arr2[] = MergeSort(nums,mid+1,end);
        return merge(arr1,arr2);
    }
    public int[] sortArray(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        if(nums.length==1){
            return nums;
        }
        return MergeSort(nums,start,end);
    }
}