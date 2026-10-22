class Solution {
    public int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }
        int totalElements = (int) Math.pow(2, n - 1);
        int mid = totalElements / 2;
        if (k <= mid) {
            return kthGrammar(n - 1, k);
        }
        else {
            int originalValue = kthGrammar(n - 1, k - mid);
            return originalValue == 0 ? 1 : 0;
        }
    }
}
