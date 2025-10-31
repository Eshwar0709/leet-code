bool isPalindrome(int x) {
    int temp=x;
    long sum=0;
    while(x>0){
        int rem=x%10;
        x=x/10;
        sum=(sum*10)+rem;
    }
    if(temp==sum){
        return true;
    }
    else{
        return false;
    }
}