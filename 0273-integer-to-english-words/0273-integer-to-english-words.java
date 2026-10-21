class Solution {
    private final String[] below20={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private final String[] tens={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"}; 

    public String numberToWords(int num) {
        if(num==0){
            return "Zero";
        }
        StringBuilder sb=new StringBuilder();
        helper(sb,num);
        return sb.toString().trim();
    }

    public void helper(StringBuilder sb, int num){
        if(num==0){
            return;
        }
        if(num<20){
            sb.append(below20[num]).append(" ");
        }
        else if(num<100){
            sb.append(tens[num/10]).append(" ");
            helper(sb,num%10);
        }
        else if(num<1000){
            helper(sb,num/100);
            sb.append("Hundred ");
            helper(sb,num%100);
        }
        else if(num<1000000){
            helper(sb,num/1000);
            sb.append("Thousand ");
            helper(sb,num%1000);
        }
        else if(num<1000000000){
            helper(sb,num/1000000);
            sb.append("Million ");
            helper(sb,num%1000000);
        }
        else{
            helper(sb,num/1000000000);
            sb.append("Billion ");
            helper(sb,num%1000000000);
        }
    }
}