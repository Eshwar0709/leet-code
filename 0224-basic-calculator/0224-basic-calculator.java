class Solution {
    int i;
    public int calculate(String s) {
        i=0;
        return evaluate(1,0,s);
    }
    public int evaluate(int sign, int total, String s){
        while(i<s.length()){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                int num=0;
                while( i<s.length() && Character.isDigit(s.charAt(i))){
                    num=(num*10)+(s.charAt(i)-'0');
                    i++;
                }
                total+=sign*num;
                continue;
            }
            if(ch=='+') sign=1;
            else if(ch=='-') sign=-1;
            else if(ch=='('){
                i++;
                total+=sign*evaluate(1,0,s);
                continue;
            }
            else if(ch==')'){
                i++;
                return total;
            }
            i++;
        }
        return total;
    }
}