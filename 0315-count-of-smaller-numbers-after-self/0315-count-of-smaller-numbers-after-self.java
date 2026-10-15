class Solution {
    static int[] result;
    public List<Integer> countSmaller(int[] nums) {
        int n=nums.length;
        result=new int[n];
        int[][] pairs=new int[n][2];
        for(int i=0;i<n;i++){
            pairs[i][0]=nums[i];
            pairs[i][1]=i;
        }
        mergeSort(pairs);
        List<Integer> res=new ArrayList<>();
        for(int i:result){
            res.add(i);
        }
        return res;
    }
    public void mergeSort(int[][] nums){
        int n=nums.length;
        if(n==1) return;
        int[][] a=new int[n/2][2];
        int[][] b=new int[n-n/2][2];
        int idx=0;
        for(int i=0;i<n/2;i++) a[i]=nums[idx++];
        for(int i=0;i<n-n/2;i++) b[i]=nums[idx++];
        mergeSort(a);
        mergeSort(b);
        merge(a, b, nums);
    }
    public void merge(int[][] a, int[][] b, int[][] nums){
        int i=0,j=0,k=0;
        int smallerRightCount=0;
        while(i<a.length && j<b.length){
            if(a[i][0]<=b[j][0]){
                result[a[i][1]]+=smallerRightCount;
                nums[k++]=a[i++];
            }
            else{
                smallerRightCount++;
                nums[k++]=b[j++];
            }
        }
        while(i<a.length){
            result[a[i][1]]+=smallerRightCount;
            nums[k++]=a[i++];
        }
        while(j<b.length){
            nums[k++]=b[j++];
        }
    }
}