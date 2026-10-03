class Solution {
    public int findNthDigit(int n) {
        if(n>=0 && n<=9){
            return n;
        }
        int len=1;
        long count=9;
        long start=1;
        while(n>len*count){
            n-=len*count;
            len+=1;
            count*=10;
            start*=10;
        }
        long ans=start+(n-1)/len;
        String s=Long.toString(ans);
        return s.charAt((n-1)%len)-'0';
    }
}