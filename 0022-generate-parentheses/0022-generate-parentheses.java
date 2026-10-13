class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate("",0,0,n,result);
        return result;
    }
    public void generate(String ans, int left, int right, int n, List<String> result){
        if(right==n){
            result.add(ans);
            return;
        }
        if(left<n) generate(ans+"(", left+1, right, n, result);
        if(right<left) generate(ans+")", left, right+1, n, result);
    }
}