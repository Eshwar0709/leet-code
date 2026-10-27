class Solution {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;
        int i = 0;
        int n = s.length();
        
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        if (i == n) return 0;
        
        int sign = 1;
        char firstChar = s.charAt(i);
        if (firstChar == '+' || firstChar == '-') {
            sign = (firstChar == '-') ? -1 : 1;
            i++;
        }
        
        int num = 0;
        
        while (i < n) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') break; 
            
            int digit = ch - '0';
            
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            num = num * 10 + digit;
            i++;
        }
        
        return num * sign;
    }
}
