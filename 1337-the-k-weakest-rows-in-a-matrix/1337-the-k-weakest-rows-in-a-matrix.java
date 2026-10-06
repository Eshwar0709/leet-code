class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] arr=new int[mat.length][2];
        for(int i=0;i<mat.length;i++){
            arr[i][0]=soldierCount(mat[i]);
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b)->{
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }
            else{
                return a[1]-b[1];
            }
        });
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=arr[i][1];
        }
        return result;
    }
    public int soldierCount(int[] row){
        int low=0,high=row.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(row[mid]==1){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}