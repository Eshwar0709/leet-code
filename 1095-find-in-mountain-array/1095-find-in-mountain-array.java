/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peak = findPeak(mountainArr, n);
        int leftResult = binarySearchAscending(mountainArr, target, 0, peak);
        if (leftResult != -1) {
            return leftResult;
        }
        return binarySearchDescending(mountainArr, target, peak + 1, n - 1);
    }
    
    private int findPeak(MountainArray mountainArr, int n) {
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    
    public int binarySearchAscending(MountainArray mountainArr, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = mountainArr.get(mid);
            if (val == target) {
                return mid;
            } else if (val < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    
    public int binarySearchDescending(MountainArray mountainArr, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = mountainArr.get(mid);
            if (val == target) {
                return mid;
            } else if (val > target) { 
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
