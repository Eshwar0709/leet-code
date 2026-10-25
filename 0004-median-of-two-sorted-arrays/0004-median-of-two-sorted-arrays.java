class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);
        int m = nums1.length, n = nums2.length, low = 0, high = m;
        
        while (low <= high) {
            int i = (low + high) / 2;
            int j = (m + n + 1) / 2 - i;
            
            int maxLeft1 = Integer.MIN_VALUE, minRight1 = Integer.MAX_VALUE;
            int maxLeft2 = Integer.MIN_VALUE, minRight2 = Integer.MAX_VALUE;
            
            if (i > 0) maxLeft1 = nums1[i - 1];
            if (i < m) minRight1 = nums1[i];
            if (j > 0) maxLeft2 = nums2[j - 1];
            if (j < n) minRight2 = nums2[j];
            
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                if ((m + n) % 2 != 0) return Math.max(maxLeft1, maxLeft2);
                return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
            }
            if (maxLeft1 > minRight2) high = i - 1;
            else low = i + 1;
        }
        return 0.0;
    }
}
