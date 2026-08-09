public class lc33_searchinRotatedSortedArray {
    int searchinArray(int[] nums, int tar) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == tar) {
                return mid;
            }
            if (nums[l] <= nums[mid]) { // For Left Sorted
                if (nums[l] <= tar && tar <= nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else { // For Right Sorted
                if (nums[mid] <= tar && tar <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        // int[] arr = { 5, 1, 2, 3, 4 };
        lc33_searchinRotatedSortedArray lc33 = new lc33_searchinRotatedSortedArray();
        int ans = lc33.searchinArray(arr, 5);
        System.out.println(ans);
    }
}
