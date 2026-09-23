class Solution {
    public int heightChecker(int[] heights) {
        int[] res=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            res[i]=heights[i];
        }
        for(int i=0;i<res.length;i++){
            int swap=0;
            for(int j=0;j<res.length-1;j++){
                if(res[j+1]<res[j]){
                    int temp=res[j];
                    res[j]=res[j+1];
                    res[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
        int count=0;
        for(int i=0;i<res.length;i++){
            if(res[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}