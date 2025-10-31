class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        Reversing(arr, 0, n - 1);
        Reversing(arr, 0, k - 1);
        Reversing(arr, k, n - 1);
    }
    void Reversing(int[] arr, int s, int e) {
        while (e > s) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}