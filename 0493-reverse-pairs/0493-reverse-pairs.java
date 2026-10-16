class Solution {
    static int count;
    public int reversePairs(int[] nums) {
        count=0;
        mergeSort(nums);
        return count;
    }
    public void mergeSort(int[] nums){
        int n=nums.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        int idx=0;
        for(int i=0;i<n/2;i++) a[i]=nums[idx++];
        for(int i=0;i<n-n/2;i++) b[i]=nums[idx++];
        mergeSort(a);
        mergeSort(b);
        inversions(a,b);
        merge(a, b, nums);
    }
    public void merge(int[] a, int[] b, int[] nums){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) nums[k++]=a[i++];
            else{  // a[i]>b[j]
                nums[k++]=b[j++];
            }
        }
        while(i<a.length) nums[k++]=a[i++];
        while(j<b.length) nums[k++]=b[j++];
    }
    public void inversions(int[] a, int[] b){
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if((long)a[i]>2*(long)b[j]){
                count+=(a.length-i);
                j++;
            }
            else{
                i++;
            }
        }
    }
}