class lc704_binarySearch {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (target < nums[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { -1, 0, 3, 5, 12 };
        int target = 9;
        lc704_binarySearch bs = new lc704_binarySearch();
        int result = bs.search(arr, target);
        System.out.println(result);
    }
}