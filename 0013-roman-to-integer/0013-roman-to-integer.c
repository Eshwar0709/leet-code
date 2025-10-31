int value(char ch){
    switch(ch){
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default : return 0;
    }
}
int romanToInt(char* s) {
    //int roman[]={'I','V','X','L','C','D','M'},value[]={1,5,10,50,100,500,1000};
    long sum=0;
    int i=0;
    while(s[i] != '\0'){
        int current=value(s[i]);
        int next=value(s[i+1]);
        if(next>current){
            sum=sum+(next-current);
            i=i+2;
        }
        else{
            sum+=current;
            i++;
        }
    } 
    return sum;
}