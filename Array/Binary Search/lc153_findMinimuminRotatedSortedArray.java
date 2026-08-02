public class lc153_findMinimuminRotatedSortedArray {
    int findMinimum(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        // int[] arr = { 3, 4, 5, 1, 2 };
        // int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int[] arr = { 2, 3, 4, 5, 1 };
        lc153_findMinimuminRotatedSortedArray lc153 = new lc153_findMinimuminRotatedSortedArray();
        int ans = lc153.findMinimum(arr);
        System.out.println(ans);
    }
}

