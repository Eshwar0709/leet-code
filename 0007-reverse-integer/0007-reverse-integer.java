class Solution {
    public int reverse(int x) {
        long res=0;
        int sign=1;
        if(x<0) {
            x=-x;
            sign=-1;
        }
        while(x>0){
            res=res*10 + x%10;
            x/=10;
        }
        if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE) {
            return 0;
        }
        return (int)(sign*res);
    }
}