class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String op: operations){
            if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                int top=st.peek();
                st.push(top*2);
            }
            else if(op.equals("+")){
                int last=st.pop();
                int slast=st.peek();
                st.push(last);
                st.push(last+slast);
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        for(int i=0;i<st.size();i++){
            sum+=st.get(i);
        }
        return sum;
    }
}