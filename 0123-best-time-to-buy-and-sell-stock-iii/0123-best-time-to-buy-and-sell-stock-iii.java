class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int n = prices.length;
        int[] leftProfit = new int[n];
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            leftProfit[i] = Math.max(leftProfit[i - 1], prices[i] - minPrice);
        }
        int maxProfit = leftProfit[n - 1];
        int maxPriceRight = prices[n - 1];
        int currentRightProfit = 0;
        for (int i = n - 2; i >= 0; i--) {
            maxPriceRight = Math.max(maxPriceRight, prices[i]);
            currentRightProfit = Math.max(currentRightProfit, maxPriceRight - prices[i]);
            maxProfit = Math.max(maxProfit, leftProfit[i] + currentRightProfit);
        }
        return maxProfit;
    }
}
