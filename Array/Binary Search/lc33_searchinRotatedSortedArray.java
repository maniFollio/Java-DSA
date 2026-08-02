public class lc33_searchinRotatedSortedArray {
    int searchinArray(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (right + left) / 2;
            if (nums[left] == target) {
                return left;
            }
            if (target < nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
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
