public class BinarySearch {
    int search(int[] arr, int target) {
        return binarySearch(arr, 0, arr.length - 1, target);
    }

    int binarySearch(int nums[], int left, int right, int key) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == key) {
                return mid;
            }
            if (nums[mid] < key) {
                return binarySearch(nums, mid + 1, right, key);
            } else {
                return binarySearch(nums, left, mid - 1, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int target = 10;
        BinarySearch bs = new BinarySearch();
        int res = bs.search(arr, target);
        System.out.println(res);
    }
}
