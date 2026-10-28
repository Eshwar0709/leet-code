class Solution {
    public String[] letcom={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits.length()==0) return result;
        backtrack(result,digits,new StringBuilder(),0);
        return result;
    }
    public void backtrack(List<String> result, String digits, StringBuilder current, int index){
        if(index==digits.length()){
            result.add(current.toString());
            return;
        }
        int digit=digits.charAt(index)-'0';
        String letters=letcom[digit];
        for(int i=0;i<letters.length();i++){
            current.append(letters.charAt(i));
            backtrack(result,digits,current,index+1);
            current.deleteCharAt(current.length()-1);
        }
    }
}