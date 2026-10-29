class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (divisor == 1) return dividend;
        if (divisor == -1) return -dividend;

        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        
        int res = 0;
        for (int i = 31; i >= 0; i--) {
            if ((absDivisor << i) <= absDividend) {
                absDividend -= (absDivisor << i);
                res |= (1 << i);
            }
        }

        return isNegative ? -res : res;
    }
}
