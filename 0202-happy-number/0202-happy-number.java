class Solution {
    public boolean isHappy(int n) {
        while(true){
            if(n==1 || n==7){
                return true;
            }
            else if(n>9){
                int sum=0;
                while(n>0){
                    int num=n%10;
                    sum+=(num*num);
                    n=n/10;
                }
                n=sum;
            }
            else{
                return false;
            }
        }
    }
}