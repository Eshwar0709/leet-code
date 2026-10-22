class Solution {
    int i;
    public String decodeString(String s) {
        i=0;
        return decode(s);
    }
    public String decode(String s){
        StringBuilder sb=new StringBuilder();
        int num=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
                i++;
            }
            else if(ch=='['){
                i++;
                String inside=decode(s);
                for(int k=0;k<num;k++) sb.append(inside);
                num=0;
            }
            else if(ch==']'){
                i++;
                return sb.toString();
            }
            else{
                sb.append(ch);
                i++;
            }
        }
        return sb.toString();
    }
}