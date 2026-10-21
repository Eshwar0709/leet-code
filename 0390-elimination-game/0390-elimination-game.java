class Solution {
    public int lastRemaining(int n) {
        boolean startL=true;
        int remain=n;
        int step=1;
        int head=1;
        while(remain>1){
            if(startL || remain%2==1){
                head=head+step;
            }
            remain=remain/2;
            step=step*2;
            startL=!startL;
        }
        return head;
    }
}